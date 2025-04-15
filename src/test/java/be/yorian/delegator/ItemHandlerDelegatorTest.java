package be.yorian.delegator;

import be.yorian.handler.AgedBrieHandler;
import be.yorian.handler.BackstagePassesHandler;
import be.yorian.handler.NormalItemHandler;
import be.yorian.handler.SulfurasHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static be.yorian.mother.ItemMother.createAgedBrieItem;
import static be.yorian.mother.ItemMother.createBackstagePassesItem;
import static be.yorian.mother.ItemMother.createNormalItem;
import static be.yorian.mother.ItemMother.createSulfurasItem;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ItemHandlerDelegatorTest {

    private ItemHandlerDelegator delegator;

    @BeforeEach
    void setup(){
        this.delegator = new ItemHandlerDelegator();
    }

    @Test
    void getHandlerForNormalItem_test() {
        assertInstanceOf(NormalItemHandler.class,
                delegator.getHandler(createNormalItem(10, 10)));
    }

    @Test
    void getHandlerForAgedBrieItem_test() {
        assertInstanceOf(AgedBrieHandler.class,
                delegator.getHandler(createAgedBrieItem(10, 5)));
    }

    @Test
    void getHandlerForSulfurasItem_test() {
        assertInstanceOf(SulfurasHandler.class,
                delegator.getHandler(createSulfurasItem(10, 80)));
    }

    @Test
    void getHandlerForBackstagePassesItem_test() {
        assertInstanceOf(BackstagePassesHandler.class,
                delegator.getHandler(createBackstagePassesItem(10, 5)));
    }
}