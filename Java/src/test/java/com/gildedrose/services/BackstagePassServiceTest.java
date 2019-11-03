package com.gildedrose.services;

import com.gildedrose.items.BackstagePassItem;
import org.junit.Before;
import org.junit.Test;

public class BackstagePassServiceTest extends ServicesTestBase<BackstagePassItem> {

	private BackstagePassItem item;
	protected BackstagePassService service;

	@Before
	public void setUp() throws Exception {
		service = new BackstagePassService();
	}

	@Override
	protected BackstagePassItem getItem() {
		return item;
	}

	@Test
	public void testBackstagePass() throws Exception {
		item = new BackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 12, 31);

		validateItem(12, 31);
		item = service.getUpdatedItem(item);
		validateItem(11, 32);
		item = service.getUpdatedItem(item);
		validateItem(10, 33);
		item = service.getUpdatedItem(item);
		validateItem(9, 35);
		item = service.getUpdatedItem(item);
		validateItem(8, 37);
		item = service.getUpdatedItem(item);
		validateItem(7, 39);
		item = service.getUpdatedItem(item);
		validateItem(6, 41);
		item = service.getUpdatedItem(item);
		validateItem(5, 43);
		item = service.getUpdatedItem(item);
		validateItem(4, 46);
		item = service.getUpdatedItem(item);
		validateItem(3, 49);
		item = service.getUpdatedItem(item);
		validateItem(2, 50);
		item = service.getUpdatedItem(item);
		validateItem(1, 50);
		item = service.getUpdatedItem(item);
		validateItem(0, 50);
		item = service.getUpdatedItem(item);
		validateItem(-1, 0);
		item = service.getUpdatedItem(item);
		validateItem(-2, 0);
		item = service.getUpdatedItem(item);

	}


}