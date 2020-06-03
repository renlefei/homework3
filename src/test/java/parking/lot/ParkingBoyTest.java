package parking.lot;

import org.junit.jupiter.api.Test;

public class ParkingBoyTest {

    @Test
    public void ShouldParkCatToFirstParkingLotWithSpace(){
        ParkingBoy parkingBoy = new ParkingJuniorBoy("PJ");
        ParkingLot parkingLot1 = new ParkingLot("parkingLot1", 1);
        ParkingLot parkingLot2 = new ParkingLot("parkingLot1", 1);

        parkingBoy.Add(parkingLot1);
        parkingBoy.Add(parkingLot2);

        assert parkingLot1 == parkingBoy.ParkCar(new Car());
        assert parkingLot2 == parkingBoy.ParkCar(new Car());
    }
}
