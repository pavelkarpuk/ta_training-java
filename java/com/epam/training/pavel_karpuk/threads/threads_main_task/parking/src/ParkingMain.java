import model.Car;
import model.Parking;

public class ParkingMain {
    public static void main(String[] args) {
        Parking parking = new Parking(5);
        for (int i = 0; i < 10; i++) {
            Car car = new Car(parking, i + 1);
            new Thread(car).start();
        }
    }
}
