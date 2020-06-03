package parking.lot;

import org.junit.jupiter.api.Test;

public class ParkingLotTest {
    @Test
    public void ShouldCouldParkCar(){
        ParkingLot parkingLot = new ParkingLot("parkingLot1",3);
        Car car = new Car();

        assert parkingLot == parkingLot.Park(car);
    }

    @Test
    public void ShouldCouldPickUpCar(){
        ParkingLot parkingLot = new ParkingLot("parkingLot2",3);
        Car car = new Car();
        Car car2 = new Car();
        parkingLot.Park(car);
        assert car == parkingLot.PickUp(car);
        assert car2 != parkingLot.PickUp(car2);
    }
}
