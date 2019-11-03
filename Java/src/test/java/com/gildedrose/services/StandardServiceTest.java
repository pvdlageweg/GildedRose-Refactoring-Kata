package com.gildedrose.services;


import com.gildedrose.items.StandardItem;
import org.junit.Before;
import org.junit.Test;

public class StandardServiceTest extends ServicesTestBase<StandardItem> {
	private StandardItem item;
	protected StandardService service;

	@Before
	public void setUp() throws Exception {
		service = new StandardService();
	}

	@Override
	protected StandardItem getItem() {
		return item;
	}

	@Test
	public void testStandardItem() throws Exception {
		item = new StandardItem( "+5 Dexterity Vest", 10, 20);

		validateItem(10, 20);
		item = service.getUpdatedItem(item);
		validateItem(9, 19);
		item = service.getUpdatedItem(item);
		validateItem(8, 18);
		item = service.getUpdatedItem(item);
		validateItem(7, 17);
		item = service.getUpdatedItem(item);
		validateItem(6, 16);
		item = service.getUpdatedItem(item);
		validateItem(5, 15);
		item = service.getUpdatedItem(item);
		item = service.getUpdatedItem(item);
		item = service.getUpdatedItem(item);
		item = service.getUpdatedItem(item);
		item = service.getUpdatedItem(item);
		validateItem(0, 10);
		item = service.getUpdatedItem(item);
		validateItem(-1, 8);
		item = service.getUpdatedItem(item);
		validateItem(-2, 6);
		item = service.getUpdatedItem(item);
		validateItem(-3, 4);
		item = service.getUpdatedItem(item);
		item = service.getUpdatedItem(item);
		item = service.getUpdatedItem(item);
		validateItem(-6, 0);
		item = service.getUpdatedItem(item);
		validateItem(-7, 0);
	}
}