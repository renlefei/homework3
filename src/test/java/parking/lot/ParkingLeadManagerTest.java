package parking.lot;

import org.junit.jupiter.api.Test;

public class ParkingLeadManagerTest {
    @Test
    public void ShouldParkingCarToLotWithMaxSpaceRate(){
        ParkingBoy parkingLeadManager = new ParkingLeadBoy("PL");
        ParkingLot parkingLot1 = new ParkingLot("parkingLot1",1);
        ParkingLot parkingLot2 = new ParkingLot("parkingLot2",2);

        parkingLot1.Park(new Car());
        parkingLot2.Park(new Car());

        parkingLeadManager.Add(parkingLot1);
        parkingLeadManager.Add(parkingLot2);

        assert parkingLot2 == parkingLeadManager.ParkCar(new Car());
    }
}
