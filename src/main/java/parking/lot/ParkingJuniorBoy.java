package parking.lot;

public class ParkingJuniorBoy extends ParkingBoy{
    public ParkingJuniorBoy(String name) {
        super(name);
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
}