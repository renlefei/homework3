package parking.lot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingManager {
    private List<ParkingLot> parkingLots = new ArrayList<>();
    private List<ParkingBoy> parkingBoys = new ArrayList<>();


    public void AddParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public void AddParkingBoy(ParkingBoy parkingBoy) {
        parkingBoys.add(parkingBoy);
    }

    public ParkingLot ParkCarToLot(Car car) {
        ParkingLot parkingLot = parkingLots.stream().filter(x -> !x.IsFull()).findFirst().get();
        parkingLot.Park(car);
        return parkingLot;
    }

    public ParkingLot ParkCarByOtherParkingBoy(Car car, String parkingBoyName) {
        ParkingBoy parkingBoy = parkingBoys.stream().filter(x -> x.name == parkingBoyName).findFirst().get();
        return parkingBoy.ParkCar(car);
    }

    public String PrintParkingLotInfo() {
        return parkingLots.stream().map(x -> x.toString()).collect(Collectors.joining("\n")) + "\n" + parkingBoys.stream().map(x -> x.toString()).collect(Collectors.joining("\n"));
    }
}
