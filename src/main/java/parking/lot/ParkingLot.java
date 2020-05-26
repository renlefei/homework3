package parking.lot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> parkingSpaces = new ArrayList<>();
    private String parkingLotName = "";
    private int size;

    public ParkingLot(String parkingLotName, int size) {
        this.parkingLotName = parkingLotName;
        this.size = size;
    }

    private int count = 0;

    public ParkingLot Park(Car car) {
        if(count < size){
            parkingSpaces.add(car);
            count++;
            return this;
        }
        return null;
    }

    public Car PickUp(Car car) {
        for(int i = 0; i< count; i ++){
            if(parkingSpaces.get(i).equals(car)){
                count--;
                return car;
            }
        }
        return null;
    }

    public boolean IsFull() {
        return count == size;
    }

    public int GetParkingLotRemainingCount() {
        return  this.size - this.count;
    }

    public double GetParkingLotRemainingCountRate(){
        return (double) ((size - count) / size);
    }

    @Override
    public String toString() {
        return "{" +
                "parkingLotName=" + parkingLotName +
                ",count=" + count +
                ", remain=" + (size -count) +
                ", Rate=" + GetParkingLotRemainingCountRate() +
                '}';
    }
}
