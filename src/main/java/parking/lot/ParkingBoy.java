package parking.lot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingBoy {
    String name = "";
    List<ParkingLot> parkingLots = new ArrayList<>();

    public void Add(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public ParkingBoy(String name) {
        this.name = name;
    }

    public ParkingLot ParkCar(Car car) {
        ParkingLot parkingLot = parkingLots.stream().filter(x -> !x.IsFull()).findFirst().get();
        if(parkingLot != null)
        {
            parkingLot.Park(car);
            return parkingLot;
        }
        return null;
    }

    @Override
    public String toString() {
        return name + "{" +
                "name=" + name +
                ", parkingLots=" + parkingLots.stream().map(x -> x.toString()).collect(Collectors.joining("\n")) +
                '}';
    }
}
