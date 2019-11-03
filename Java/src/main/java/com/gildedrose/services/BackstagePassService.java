package com.gildedrose.services;

import com.gildedrose.ItemService;
import com.gildedrose.items.BackstagePassItem;

public class BackstagePassService implements ItemService<BackstagePassItem> {
	@Override
	public BackstagePassItem getUpdatedItem(final BackstagePassItem item) {
		int newSellIn = getUpdatedSellIn(item);
		int newQuality;
		if (newSellIn >= 10) {
			newQuality = item.quality + 1;
		} else if (newSellIn >= 5) {
			newQuality = item.quality + 2;
		} else if (newSellIn >= 0) {
			newQuality = item.quality + 3;
		} else {
			newQuality = 0;
		}

		return new BackstagePassItem(item.name, newSellIn, Math.min(newQuality, 50));
	}
}
