package com.gildedrose.services;


import com.gildedrose.items.ConjuredItem;
import org.junit.Before;
import org.junit.Test;

public class ConjuredItemServiceTest extends ServicesTestBase<ConjuredItem> {
	private ConjuredItem item;
	protected ConjuredItemService service;

	@Before
	public void setUp() throws Exception {
		service = new ConjuredItemService();
	}

	@Override
	protected ConjuredItem getItem() {
		return item;
	}

	@Test
	public void testStandardItem() throws Exception {
		item = new ConjuredItem("Conjured", 10, 30);

		validateItem(10, 30);
		item = service.getUpdatedItem(item);
		validateItem(9, 28);
		item = service.getUpdatedItem(item);
		validateItem(8, 26);
		item = service.getUpdatedItem(item);
		validateItem(7, 24);
		item = service.getUpdatedItem(item);
		validateItem(6, 22);
		item = service.getUpdatedItem(item);
		validateItem(5, 20);
		item = service.getUpdatedItem(item);
		validateItem(4, 18);
		item = service.getUpdatedItem(item);
		validateItem(3, 16);
		item = service.getUpdatedItem(item);
		validateItem(2, 14);
		item = service.getUpdatedItem(item);
		validateItem(1, 12);
		item = service.getUpdatedItem(item);
		validateItem(0, 10);
		item = service.getUpdatedItem(item);
		validateItem(-1, 6);
		item = service.getUpdatedItem(item);
		validateItem(-2, 2);
		item = service.getUpdatedItem(item);
		validateItem(-3, 0);
		item = service.getUpdatedItem(item);
		validateItem(-4, 0);
	}
}