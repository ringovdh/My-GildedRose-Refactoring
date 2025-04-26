package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.increaseQualityUntilMaximum;

public class BackstagePassesHandler implements ItemHandler {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    private int calculateQuality(Item item) {
        int qualityGained;
        if (item.sellIn > 10) {
            qualityGained = 1;
        } else if (item.sellIn > 5) {
            qualityGained = 2;
        } else if (item.sellIn > 0) {
            qualityGained = 3;
        } else {
            return 0;
        }
        return increaseQualityUntilMaximum(item.quality, qualityGained);
    }


}
