package com.oracle.shopping.service;

import org.junit.Assert;
import org.junit.Test;

import com.oracle.shopping.model.Item;

public class ShoppingCartServiceImplTest {

	@Test
	public void testAddItemSuccess() {
		ShoppingCartServiceImpl testService = new ShoppingCartServiceImpl();
		Item item = new Item("test", 2);
		
		//method to test
		testService.addItem(item, 1);
		
		//did it work?
		Assert.assertTrue("Failed to add item", testService.getShoppingCart().get(item).equals(Integer.valueOf(1)));
	}
}
