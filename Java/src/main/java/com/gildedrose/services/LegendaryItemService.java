package com.gildedrose.services;

import com.gildedrose.ItemService;
import com.gildedrose.items.LegendaryItem;

public class LegendaryItemService implements ItemService<LegendaryItem> {
	@Override
	public int getUpdatedSellIn(LegendaryItem item) {
		return item.sellIn;
	}

	@Override
	public LegendaryItem getUpdatedItem(final LegendaryItem item) {
		return item;
	}
}
