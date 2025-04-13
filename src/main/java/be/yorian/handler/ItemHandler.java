package be.yorian.handler;

import be.yorian.Item;

public abstract class ItemHandler {

    protected final int QUALITY_MAX = 50;

    protected abstract void updateItem(Item item);
}
