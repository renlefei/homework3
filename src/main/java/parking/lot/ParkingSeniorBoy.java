package parking.lot;
import java.util.Collections;
import java.util.Comparator;

public class ParkingSeniorBoy extends ParkingBoy{
    public ParkingSeniorBoy(String name) {
        super(name);
    }

    public ParkingLot ParkCar(Car car) {
        ParkingLot parkingLot = Collections.max(parkingLots, Comparator.comparing(x -> x.GetParkingLotRemainingCount()));
        parkingLot.Park(car);
        return parkingLot;
    }
}
