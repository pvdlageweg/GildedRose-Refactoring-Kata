package com.gildedrose.services;

import com.gildedrose.items.AgedBrieItem;
import org.junit.Before;
import org.junit.Test;

public class AgedBrieItemServiceTest extends ServicesTestBase<AgedBrieItem> {

	private AgedBrieItem item;
	protected AgedBrieItemService service;

	@Before
	public void setUp() throws Exception {
		service = new AgedBrieItemService();
	}

	@Override
	protected AgedBrieItem getItem() {
		return item;
	}

	@Test
	public void testAgedBrie() throws Exception {
		item = new AgedBrieItem("Aged Brie", 2, 0);

		validateItem(2, 0);
		item = service.getUpdatedItem(item);
		validateItem(1, 1);
		item = service.getUpdatedItem(item);
		validateItem(0, 2);
		item = service.getUpdatedItem(item);
		validateItem(-1, 4);
		item = service.getUpdatedItem(item);
		validateItem(-2, 6);
		item = service.getUpdatedItem(item);
		validateItem(-3, 8);
	}
}