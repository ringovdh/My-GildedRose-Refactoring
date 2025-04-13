package be.yorian.handler;

import be.yorian.Item;

public class NormalItemHandler extends ItemHandler {

    @Override
    public void updateItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
