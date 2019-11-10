package com.gildedrose;

import com.google.common.collect.ImmutableList;

import java.util.List;

class GildedRose {

	private List<Item> items;

	public GildedRose(final List<? extends Item> items) {
		this.items = (List<Item>)items;
	}

	public List<? extends Item> getItems() {
		return ImmutableList.copyOf(items);
	}

	@SuppressWarnings("unchecked")
	public <T extends Item> void updateQuality() {
		items.forEach(item->{
			ItemService<T> service = ServiceFactory.getItemsService(item);
			T newItem = (T)service.getUpdatedItem((T)item);
			item.sellIn = newItem.sellIn;
			item.quality = newItem.quality;
		});
	}
}