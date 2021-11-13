package bars;

public class MilkyWay extends BarBase {

    public MilkyWay(String name, int weight, int amountOfSugar, int amountOfCalories) {
        super(name, weight, amountOfSugar, amountOfCalories);
    }

    @Override
    public String toString() {
        return "MilkyWay{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
