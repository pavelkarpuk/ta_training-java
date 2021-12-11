package bars;

public class KitKat extends BarBase {

    public KitKat(String name, int weight, int amountOfSugar, int amountOfCalories) {
        super(name, weight, amountOfSugar, amountOfCalories);
    }

    @Override
    public String toString() {
        return "KitKat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
