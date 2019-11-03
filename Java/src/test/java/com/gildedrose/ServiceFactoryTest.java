package com.gildedrose;

import com.gildedrose.items.AgedBrieItem;
import com.gildedrose.services.AgedBrieItemService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceFactoryTest {
	@Test
	public void testThatCorrectServiceIsReturned() throws Exception {
		AgedBrieItem item = new AgedBrieItem("xx", 0, 0);
		assertThat((ItemService<? extends Item>) ServiceFactory.getItemsService(item)).isInstanceOf(AgedBrieItemService.class);
	}
}