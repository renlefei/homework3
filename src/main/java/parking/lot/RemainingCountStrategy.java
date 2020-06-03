package parking.lot;

public class RemainingCountStrategy implements ParkingStrategy {
    @Override
    public double getStrategyValue(int paringSize, int parkingCount) {
        return paringSize - parkingCount;
    }
}
