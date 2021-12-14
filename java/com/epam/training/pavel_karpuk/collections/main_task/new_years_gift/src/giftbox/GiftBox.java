package giftbox;

import sweets.AbstractSweet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GiftBox {

    private List<AbstractSweet> sweets;

    public GiftBox(List<AbstractSweet> sweets) {
        this.sweets = sweets;
    }

    public List<AbstractSweet> getSweets() {
        return sweets;
    }

    public int getGiftBoxWeight () {
        int totalWeight = 0;
        for (AbstractSweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public void sortByWeight() {
        sweets.sort(Comparator.comparingInt(AbstractSweet::getWeight));
    }

    public List<AbstractSweet> getSweetsWithAmountOfSugarInRange (int from, int to) {
        List <AbstractSweet> listWithAMountOfSugarInRange = new ArrayList<>();
        for (AbstractSweet sweet : sweets) {
            if (sweet.getAmountOfSugar() >= from && sweet.getAmountOfSugar() <= to) {
                listWithAMountOfSugarInRange.add(sweet);
            }
        }
        return listWithAMountOfSugarInRange;
    }

    @Override
    public String toString() {
        return "GiftBox{" +
                "sweets=" + sweets +
                '}';
    }
}
