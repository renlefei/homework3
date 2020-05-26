package parking.lot;

import org.junit.jupiter.api.Test;

public class ParkingManagerTest {
    @Test
    public void ShouldParkingCarToLotBySelf(){
        ParkingManager parkingManager = new ParkingManager();

        ParkingLot parkingLot1 = new ParkingLot("parkingLot1",1);
        ParkingLot parkingLot2 = new ParkingLot("parkingLot2",2);
        parkingManager.AddParkingLot(parkingLot1);
        parkingManager.AddParkingLot(parkingLot2);

        assert parkingLot1 == parkingManager.ParkCarToLot(new Car());
    }

    @Test
    public void ShouldParkingCarToLotByOtherParkingBoy(){
        ParkingManager parkingManager = new ParkingManager();

        ParkingLot parkingLot1 = new ParkingLot("parkingLot1",1);
        ParkingLot parkingLot2 = new ParkingLot("parkingLot2",2);
        ParkingLot parkingLot3 = new ParkingLot("parkingLot3",3);
        ParkingLot parkingLot4 = new ParkingLot("parkingLot4",4);

        ParkingBoy parkingBoy1 = new ParkingJuniorBoy("P1");
        parkingBoy1.Add(parkingLot1);
        parkingBoy1.Add(parkingLot2);

        ParkingBoy parkingBoy2 = new ParkingSeniorBoy("P2");
        parkingBoy2.Add(parkingLot3);
        parkingBoy2.Add(parkingLot4);

        parkingManager.AddParkingBoy(parkingBoy1);
        parkingManager.AddParkingBoy(parkingBoy2);

        assert parkingLot4 == parkingManager.ParkCarByOtherParkingBoy(new Car(), "P2");
    }

    @Test
    public void ShouldPrintParkingBoyInfo(){
        ParkingManager parkingManager = new ParkingManager();

        ParkingLot parkingLot1 = new ParkingLot("parkingLot1",1);
        ParkingLot parkingLot2 = new ParkingLot("parkingLot2",2);
        ParkingLot parkingLot3 = new ParkingLot("parkingLot3",3);



        ParkingBoy parkingBoy1 = new ParkingJuniorBoy("ParkingBoy1");
        parkingBoy1.Add(parkingLot1);

        ParkingBoy parkingBoy2 = new ParkingSeniorBoy("ParkingBoy2");
        parkingBoy2.Add(parkingLot2);

        parkingManager.AddParkingLot(parkingLot3);

        parkingManager.AddParkingBoy(parkingBoy1);
        parkingManager.AddParkingBoy(parkingBoy2);

        String result = parkingManager.PrintParkingLotInfo();
        String expected = "{parkingLotName=parkingLot3,count=0, remain=3, Rate=1.0}\n" +
                "ParkingBoy1{name=ParkingBoy1, parkingLots={parkingLotName=parkingLot1,count=0, remain=1, Rate=1.0}}\n" +
                "ParkingBoy2{name=ParkingBoy2, parkingLots={parkingLotName=parkingLot2,count=0, remain=2, Rate=1.0}}";
        assert result.equals(expected);
    }
}
