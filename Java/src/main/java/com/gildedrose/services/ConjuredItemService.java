package com.gildedrose.services;

import com.gildedrose.ItemService;
import com.gildedrose.items.ConjuredItem;

public class ConjuredItemService implements ItemService<ConjuredItem> {
	@Override
	public ConjuredItem getUpdatedItem(final ConjuredItem item) {
		int newQuality;
		if (getUpdatedSellIn(item) < 0) {
			newQuality = item.quality - 4;
		} else {
			newQuality = item.quality - 2;
		}
		int qualityNeverBlowZero = Math.max(newQuality, 0);
		return new ConjuredItem(item.name, getUpdatedSellIn(item), Math.min(qualityNeverBlowZero, 50));
	}
}

