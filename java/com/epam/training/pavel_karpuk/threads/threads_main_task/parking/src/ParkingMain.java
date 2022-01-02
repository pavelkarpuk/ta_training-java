public class ParkingMain {
    public static void main(String[] args) {
        Parking parking = new Parking(5);
        for (int i = 0; i < 10; i++) {
            Car car = new Car(parking, i);
            new Thread(car).start();
        }
    }
}
