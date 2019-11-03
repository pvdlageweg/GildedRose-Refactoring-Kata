package com.gildedrose.services;

import com.gildedrose.ItemService;
import com.gildedrose.items.StandardItem;

public class StandardService implements ItemService<StandardItem> {
	@Override
	public StandardItem getUpdatedItem(final StandardItem item) {
				int newQuality;
		if (getUpdatedSellIn(item) < 0) {
			newQuality = item.quality - 2;
		} else {
			newQuality = item.quality - 1;
		}
		int qualityNeverBlowZero = Math.max(newQuality, 0);
		return new StandardItem(item.name, getUpdatedSellIn(item), Math.min(qualityNeverBlowZero, 50));
	}
}
