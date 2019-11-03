package com.gildedrose;

import com.gildedrose.items.StandardItem;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

	@Test
	public void foo() {
		List<Item> items = Collections.singletonList(new StandardItem("foo", 0, 0));
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.getItems()).hasSize(1);
		assertThat(app.getItems().get(0).name).isEqualTo("foo");
	}

}
