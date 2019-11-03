package com.gildedrose.services;

import com.gildedrose.Item;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class ServicesTestBase<T extends Item> {

	protected abstract T getItem();

	protected void validateItem(final int expectedSellIn, final int expectedQuality) {
		assertThat(getItem()).isNotNull();
		assertThat(getItem().sellIn).isEqualTo(expectedSellIn);
		assertThat(getItem().quality).isEqualTo(expectedQuality);
	}
}
