package be.yorian.delegator;

import be.yorian.Item;
import be.yorian.handler.AgedBrieHandler;
import be.yorian.handler.BackstagePassesHandler;
import be.yorian.handler.ConjuredItemHandler;
import be.yorian.handler.ItemHandler;
import be.yorian.handler.NormalItemHandler;
import be.yorian.handler.SulfurasHandler;

public class ItemHandlerDelegator {

    private AgedBrieHandler agedBrieHandler;
    private BackstagePassesHandler backstagePassesHandler;
    private SulfurasHandler sulfurasHandler;
    private NormalItemHandler normalItemHandler;
    private ConjuredItemHandler conjuredItemHandler;

    public ItemHandler getHandler(Item item) {
        switch (item.name) {
            case "Aged Brie" -> {
                return getAgedBrieHandler();
            }
            case "Backstage passes to a TAFKAL80ETC concert" -> {
                return getBackstagePassesHandler();
            }
            case "Sulfuras, Hand of Ragnaros" -> {
                return getSulfurasHandler();
            }
            case "Conjured Mana Cake" -> {
                return getConjuredItemHandler();
            }
            default -> {
                return getNormalItemHandler();
            }
        }
    }

    private ItemHandler getNormalItemHandler() {
        if (this.normalItemHandler == null) {
            this.normalItemHandler = new NormalItemHandler();
        }
        return this.normalItemHandler;
    }

    private ItemHandler getConjuredItemHandler() {
        if (this.conjuredItemHandler == null) {
            this.conjuredItemHandler = new ConjuredItemHandler();
        }
        return this.conjuredItemHandler;
    }

    private ItemHandler getSulfurasHandler() {
        if (this.sulfurasHandler == null) {
            this.sulfurasHandler = new SulfurasHandler();
        }
        return this.sulfurasHandler;
    }

    private ItemHandler getBackstagePassesHandler() {
        if (this.backstagePassesHandler == null) {
            this.backstagePassesHandler = new BackstagePassesHandler();
        }
        return this.backstagePassesHandler;
    }

    private ItemHandler getAgedBrieHandler() {
        if (this.agedBrieHandler == null) {
            this.agedBrieHandler = new AgedBrieHandler();
        }
        return this.agedBrieHandler;
    }
}
