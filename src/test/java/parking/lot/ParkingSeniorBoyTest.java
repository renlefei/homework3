package parking.lot;

import org.junit.jupiter.api.Test;

public class ParkingSeniorBoyTest {

    @Test
    public void ShouldParkingCarToLotWithMaxSpace(){
        ParkingSeniorBoy parkingSeniorManager = new ParkingSeniorBoy("P1");
        ParkingLot parkingLot1 = new ParkingLot("parkingLot1",2);
        ParkingLot parkingLot2 = new ParkingLot("parkingLot2",3);

        parkingLot1.Park(new Car());
        parkingLot2.Park(new Car());
        parkingLot2.Park(new Car());

        parkingSeniorManager.Add(parkingLot1);
        parkingSeniorManager.Add(parkingLot2);

        assert parkingLot1 == parkingSeniorManager.ParkCar(new Car());
    }
}
