package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.decreaseQualityUntilMinimum;
import static be.yorian.util.GildedRoseUtils.isSellInDatePassed;

public class NormalItemHandler implements ItemHandler {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    private int calculateQuality(Item item) {
        int qualityLost = isSellInDatePassed(item.sellIn) ? 2 : 1;
        return decreaseQualityUntilMinimum(item.quality, qualityLost);
    }
}