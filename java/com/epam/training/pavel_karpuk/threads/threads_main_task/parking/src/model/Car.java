import java.util.Random;

public class Car implements Runnable {

    private static final Random random = new Random();

    private final Parking parking;
    private final int carNumber;

    public Car(Parking parking, int carNumber) {
        this.parking = parking;
        this.carNumber = carNumber;
    }

    @Override
    public void run() {

        boolean acquired = parking.acquireSpot(carNumber);

        if (acquired) {
            try {
                Thread.sleep(random.nextInt(10 * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                parking.releaseSpot(carNumber);
            }
        } else {
            Thread.currentThread().interrupt();
        }
    }
}
