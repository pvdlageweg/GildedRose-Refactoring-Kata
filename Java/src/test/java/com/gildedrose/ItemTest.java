package com.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {

    @Test
    public void testCreteItemsTest() throws Exception {
        Item item = new Item("test name", 7, 12);
        assertThat(item).isNotNull();
        assertThat(item.name).isEqualTo("test name");
        assertThat(item.sellIn).isEqualTo(7);
        assertThat(item.quality).isEqualTo(12);
        assertThat(item.toString()).isEqualTo("test name, 7, 12");
    }

}