package com.gildedrose.services;


import com.gildedrose.items.LegendaryItem;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendaryItemServiceTest extends ServicesTestBase<LegendaryItem> {
	private LegendaryItem item;
	protected LegendaryItemService service;

	@Before
	public void setUp() throws Exception {
		service = new LegendaryItemService();
		item = new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80);
	}

	@Override
	protected LegendaryItem getItem() {
		return item;
	}

	@Test
	public void testLegendaryItem() throws Exception {
		for (int i = 0; i < 20; i++) {
			item = service.getUpdatedItem(item);
			validateItem(0, 80);
		}
	}

	@Test
	public void testThatSellInRemainsTheSame() throws Exception {
		for (int i = 0; i < 20; i++) {
			assertThat(service.getUpdatedSellIn(item)).isZero();
		}
	}
}