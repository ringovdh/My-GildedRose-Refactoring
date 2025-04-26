package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.increaseQualityUntilMaximum;
import static be.yorian.util.GildedRoseUtils.isSellInDatePassed;

public class AgedBrieHandler implements ItemHandler {


    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    private int calculateQuality(Item item) {
        int qualityGained = isSellInDatePassed(item.sellIn) ? 2 : 1;
        return increaseQualityUntilMaximum(item.quality, qualityGained);
    }
}
