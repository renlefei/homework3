package parking.lot;
import java.util.Collections;
import java.util.Comparator;

public class ParkingSeniorBoy extends ParkingBoy{
    public ParkingSeniorBoy(String name) {
        super(name);
    }

    public ParkingLot ParkCar(Car car) {
        ParkingStrategyContext parkingStrategyContext = new ParkingStrategyContext(new RemainingCountStrategy());
        ParkingLot parkingLot = Collections.max(parkingLots, Comparator.comparing(x -> parkingStrategyContext.executeParkingStrategy(x.GetParkingSize(), x.GetParkingCount())));
        parkingLot.Park(car);
        return parkingLot;
    }
}
