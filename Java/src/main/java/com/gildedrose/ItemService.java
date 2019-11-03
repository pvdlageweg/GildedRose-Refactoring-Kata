package com.gildedrose;

@FunctionalInterface
public interface ItemService<T extends Item> {
	default int getUpdatedSellIn(final T item) {
		return item.sellIn - 1;
	}

	T getUpdatedItem(final T item);
}
