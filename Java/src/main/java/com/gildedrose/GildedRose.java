package com.gildedrose;

import com.google.common.collect.ImmutableList;

import java.util.List;

class GildedRose {

	private volatile List<? extends Item> items;

	public GildedRose(final List<? extends Item> items) {
		this.items = items;
	}

	public List<? extends Item> getItems() {
		return ImmutableList.copyOf(items);
	}

	@SuppressWarnings("unchecked")
	public <T extends Item> void updateQuality() {
		items = items.stream()
				.map(item -> ((ItemService<T>) ServiceFactory.getItemsService(item)).getUpdatedItem((T) item)).collect(ImmutableList.toImmutableList());
	}
}