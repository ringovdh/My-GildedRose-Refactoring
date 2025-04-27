package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.isSellInDatePassed;

public class ConjuredItemHandler implements ItemHandler {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    private int calculateQuality(Item item) {
        int qualityLost = isSellInDatePassed(item.sellIn) ? 4 : 2;
        return Math.max(item.quality - qualityLost, 0);
    }
}
