package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.isSellInDatePassed;

public class BackstagePassesHandler implements ItemHandler {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    private int calculateQuality(Item item) {
        int qualityGained = 0;
        if (isSellInDatePassed(item.sellIn)) {
            return qualityGained;
        }
        if (item.sellIn >= 10) {
            qualityGained +=1;
        }
        if (item.sellIn > 5 && item.sellIn < 10) {
            qualityGained +=2;
        }
        if (item.sellIn <= 5) {
            qualityGained += 3;
        }

        return Math.min(item.quality + qualityGained, 50);
    }


}
