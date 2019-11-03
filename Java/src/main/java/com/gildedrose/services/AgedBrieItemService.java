package com.gildedrose.services;

import com.gildedrose.ItemService;
import com.gildedrose.items.AgedBrieItem;

public class AgedBrieItemService implements ItemService<AgedBrieItem> {
	@Override
	public AgedBrieItem getUpdatedItem(final AgedBrieItem item) {
		// The is different from the specs but matches the current working code
		int newSellIn = getUpdatedSellIn(item);
		int newQuality;
		if (newSellIn >= 0) {
			newQuality = item.quality + 1;
		} else {
			newQuality = item.quality + 2;
		}
		return new AgedBrieItem(item.name, newSellIn, Math.min(newQuality, 50));
	}
}
