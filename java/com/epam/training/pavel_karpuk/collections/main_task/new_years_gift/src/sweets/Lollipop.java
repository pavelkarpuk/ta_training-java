package sweets;

import types.LollipopTasteType;
import types.SweetType;

import java.util.Objects;

public class Lollipop extends AbstractSweet {

    private LollipopTasteType lollipopTasteType;

    public Lollipop(SweetType sweetType, String name, int weight, int amountOfSugar, int amountOfCalories, LollipopTasteType lollipopTasteType) {
        super(sweetType, name, weight, amountOfSugar, amountOfCalories);
        this.lollipopTasteType = lollipopTasteType;
    }

    public LollipopTasteType getLollipopTasteType() {
        return lollipopTasteType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lollipop that = (Lollipop) o;
        return lollipopTasteType == that.lollipopTasteType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lollipopTasteType);
    }

    @Override
    public String toString() {
        return "AbstractLollipop{" +
                "lollipopTasteType=" + lollipopTasteType +
                '}';
    }
}
