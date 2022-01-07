import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Parking {

    private final Semaphore spots;

    public Parking(int spotsCount) {
        this.spots = new Semaphore(spotsCount, true);
    }

    public boolean acquireSpot(int carNumber) {
        System.out.println("Сar number " + carNumber + " is trying to get a parking spot");

        try {
            boolean acquired = spots.tryAcquire(7, TimeUnit.SECONDS);

            if (!acquired) {
                System.out.println("Сar number " + carNumber + " has left the parking");
                return false;
            }

            System.out.println("Сar number " + carNumber + " occupies an empty spot");
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void releaseSpot(int carNumber) {
        System.out.println("Сar number " + carNumber + " has released a spot");
        spots.release();
    }
}
