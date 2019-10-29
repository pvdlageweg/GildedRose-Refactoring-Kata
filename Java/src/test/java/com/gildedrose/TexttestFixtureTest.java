package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TexttestFixtureTest {
	private Item[] items;

	private GildedRose app;

	@Before
	public void setUp() throws Exception {
		items = new Item[]{null};
		app = new GildedRose(items);
	}

	@Test
	public void testPlusFiveDexterity() throws Exception {
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		items[0] = item;

		assertThat(items).hasSize(1);
		validateItem(item, 10, 20);
		app.updateQuality();
		validateItem(item, 9, 19);
		app.updateQuality();
		validateItem(item, 8, 18);
		app.updateQuality();
		validateItem(item, 7, 17);
		app.updateQuality();
		validateItem(item, 6, 16);
		app.updateQuality();
		validateItem(item, 5, 15);
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		validateItem(item, 0, 10);
		app.updateQuality();
		validateItem(item, -1, 8);
		app.updateQuality();
		validateItem(item, -2, 6);
		app.updateQuality();
		validateItem(item, -3, 4);
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		validateItem(item, -6, 0);
		app.updateQuality();
		validateItem(item, -7, 0);
	}

	@Test
	public void testAgedBrie() throws Exception {
		Item item = new Item("Aged Brie", 2, 0);
		items[0] = item;

		assertThat(items).hasSize(1);
		validateItem(item, 2, 0);
		app.updateQuality();
		validateItem(item, 1, 1);
		app.updateQuality();
		validateItem(item, 0, 2);
		app.updateQuality();
		validateItem(item, -1, 4);
		app.updateQuality();
		validateItem(item, -2, 6);
		app.updateQuality();
		validateItem(item, -3, 8);
	}

	@Test
	public void testMongoose() throws Exception {
		Item item = new Item("Elixir of the Mongoose", 5, 7);
		items[0] = item;

		assertThat(items).hasSize(1);
		validateItem(item, 5, 7);
		app.updateQuality();
		validateItem(item, 4, 6);
		app.updateQuality();
		validateItem(item, 3, 5);
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		validateItem(item, 0, 2);
		app.updateQuality();
		validateItem(item, -1, 0);
		app.updateQuality();
		validateItem(item, -2, 0);
	}

	@Test
	public void testSulfurasStartAddSellInZeroStaysZeroQualityDoesNotChange() throws Exception {
		Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
		items[0] = item;

		assertThat(items).hasSize(1);
		for (int i = 0; i < 20; i++) {
			app.updateQuality();
			validateItem(item, 0, 80);
		}
	}

	@Test
	public void testSulfurasStartAddSellInMinusOneDateStaysSameQualityDoesNotChange() throws Exception {
		Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
		items[0] = item;

		assertThat(items).hasSize(1);
		for (int i = 0; i < 20; i++) {
			app.updateQuality();
			validateItem(item, -1, 80);
		}
	}

	@Test
	public void testBackstagePass() throws Exception {
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 12, 31);
		items[0] = item;

		assertThat(items).hasSize(1);
		validateItem(item, 12, 31);
		app.updateQuality();
		validateItem(item, 11, 32);
		app.updateQuality();
		validateItem(item, 10, 33);
		app.updateQuality();
		validateItem(item, 9, 35);
		app.updateQuality();
		validateItem(item, 8, 37);
		app.updateQuality();
		validateItem(item, 7, 39);
		app.updateQuality();
		validateItem(item, 6, 41);
		app.updateQuality();
		validateItem(item, 5, 43);
		app.updateQuality();
		validateItem(item, 4, 46);
		app.updateQuality();
		validateItem(item, 3, 49);
		app.updateQuality();
		validateItem(item, 2, 50);
		app.updateQuality();
		validateItem(item, 1, 50);
		app.updateQuality();
		validateItem(item, 0, 50);
		app.updateQuality();
		validateItem(item, -1, 0);
		app.updateQuality();
		validateItem(item, -2, 0);
		app.updateQuality();
	}

//    @Test
//    public void testConjured() throws Exception{
//        Item item = new Item("Conjured Mana Cake", 5, 7);
//        items[0] = item;
//
//        assertThat(items).hasSize(1);
//        validateItem(item, 5, 7);
//        app.updateQuality();
//        validateItem(item, 4, 5);
//        app.updateQuality();
//        validateItem(item, 3, 3);
//        app.updateQuality();
//        validateItem(item, 2, 1);
//        app.updateQuality();
//        validateItem(item, 1, 0);
//        app.updateQuality();
//        validateItem(item, 0, 0);
//        app.updateQuality();
//        validateItem(item, -1, 0);
//    }

	private void validateItem(final Item item, final int expectedSellIn, final int expectedQuality) {
		assertThat(item).isNotNull();
		assertThat(item.sellIn).isEqualTo(expectedSellIn);
		assertThat(item.quality).isEqualTo(expectedQuality);
	}
/*
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
             //   new Item("+5 Dexterity Vest", 10, 20), //
             //   new Item("Aged Brie", 2, 0), //
            //    new Item("Elixir of the Mongoose", 5, 7), //
//                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
//                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
//                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48),
//                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
//                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
//                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 25;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
*/
}
