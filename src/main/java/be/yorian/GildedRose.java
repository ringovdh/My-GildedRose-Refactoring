package be.yorian;

import be.yorian.handler.AgedBrieHandler;
import be.yorian.handler.BackstagePassesHandler;
import be.yorian.handler.NormalItemHandler;
import be.yorian.handler.SulfurasHandler;

public class GildedRose {
    private final Item[] items;
    private final AgedBrieHandler agedBrieHandler;
    private final BackstagePassesHandler backstagePassesHandler;
    private final SulfurasHandler sulfurasHandler;
    private final NormalItemHandler normalItemHandler;

    public GildedRose(Item[] items) {
        this.items = items;
        agedBrieHandler = new AgedBrieHandler();
        backstagePassesHandler = new BackstagePassesHandler();
        sulfurasHandler = new SulfurasHandler();
        normalItemHandler = new NormalItemHandler();
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie" -> agedBrieHandler.updateItem(item);
                case "Backstage passes to a TAFKAL80ETC concert" -> backstagePassesHandler.updateItem(item);
                case "Sulfuras, Hand of Ragnaros" -> sulfurasHandler.updateItem(item);
                default -> normalItemHandler.updateItem(item);
            }
        }
    }

    public Item[] getItems() {
        return items;
    }
}
