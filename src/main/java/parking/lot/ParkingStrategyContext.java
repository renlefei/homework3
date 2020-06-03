package parking.lot;

public class ParkingStrategyContext {
    private ParkingStrategy strategy;

    public ParkingStrategyContext(ParkingStrategy strategy){
        this.strategy = strategy;
    }

    public double executeParkingStrategy(int parkingSize, int parkingCount){
        return strategy.getStrategyValue(parkingSize, parkingCount);
    }
}
