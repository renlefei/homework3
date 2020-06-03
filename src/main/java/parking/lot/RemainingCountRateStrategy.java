package parking.lot;

public class RemainingCountRateStrategy implements ParkingStrategy {
    @Override
    public double getStrategyValue(int paringSize, int parkingCount) {
        return (paringSize - parkingCount) / paringSize;
    }
}
