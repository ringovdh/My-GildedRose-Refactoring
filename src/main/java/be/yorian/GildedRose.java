package be.yorian;

import be.yorian.delegator.ItemHandlerDelegator;

import java.util.Arrays;

public class GildedRose {
    private final Item[] items;
    private final ItemHandlerDelegator delegator;

    public GildedRose(Item[] items) {
        this.items = items;
        this.delegator = new ItemHandlerDelegator();
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(item ->
            delegator.getHandler(item).updateItem(item));
    }

    public Item[] getItems() {
        return items;
    }
}
