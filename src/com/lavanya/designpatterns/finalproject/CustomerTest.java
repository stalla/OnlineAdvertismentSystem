package com.lavanya.designpatterns.finalproject;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void testName() {
		Customer customer = new Customer("BurgerKing", CategoryType.FAST_FOOD);
		
		Assert.assertEquals("BurgerKing", customer.getName());
	}

}
