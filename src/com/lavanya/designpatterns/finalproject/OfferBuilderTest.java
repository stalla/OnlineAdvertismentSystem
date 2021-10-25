package com.lavanya.designpatterns.finalproject;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lavanya.designpatterns.builder.Offer;

import junit.framework.Assert;

public class OfferBuilderTest {

	@Test
	public void testcreateOffer() {
		Offer offer1 = new Offer
				.OfferBuilder()
				.withName("offerOne").build();
		
		assertNotNull(offer1);
	}

}
