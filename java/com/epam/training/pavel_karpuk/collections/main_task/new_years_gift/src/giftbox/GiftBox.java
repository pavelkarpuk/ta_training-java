package giftbox;

import bars.BarBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GiftBox {

    private List<BarBase> bars;

    public GiftBox(List<BarBase> bars) {
        this.bars = bars;
    }

    public List<BarBase> getBars() {
        return bars;
    }

    public int getGiftBoxWeight () {
        int totalWeight = 0;
        for (BarBase bar : bars) {
            totalWeight += bar.getWeight();
        }
        return totalWeight;
    }

    public void sortByWeight() {
        bars.sort(Comparator.comparingInt(BarBase::getWeight));
    }

    public List<BarBase> getBarsWithAmountOfSugarInRange (int from, int to) {
        List <BarBase> listWithAMountOfSugarInRange = new ArrayList<>();
        for (BarBase bar : bars) {
            if (bar.getAmountOfSugar() >= from && bar.getAmountOfSugar() <= to) {
                listWithAMountOfSugarInRange.add(bar);
            }
        }
        return listWithAMountOfSugarInRange;
    }

    @Override
    public String toString() {
        return "GiftBox{" +
                "bars=" + bars +
                '}';
    }
}
