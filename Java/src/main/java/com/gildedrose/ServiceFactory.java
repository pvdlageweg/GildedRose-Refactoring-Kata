package com.gildedrose;

import com.gildedrose.items.*;
import com.gildedrose.services.*;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {

	private static final Map<Class<? extends Item>, ItemService<? extends Item>> SERVICE_MAP = new HashMap<>();

	static {
		SERVICE_MAP.put(StandardItem.class, new StandardService());
		SERVICE_MAP.put(AgedBrieItem.class, new AgedBrieItemService());
		SERVICE_MAP.put(ConjuredItem.class, new ConjuredItemService());
		SERVICE_MAP.put(BackstagePassItem.class, new BackstagePassService());
		SERVICE_MAP.put(LegendaryItem.class, new LegendaryItemService());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ItemService<? extends Item>> T getItemsService(final Item item) {
		return (T) SERVICE_MAP.get(item.getClass());
	}

	private ServiceFactory() {
		// prevent instantiation
	}
}
