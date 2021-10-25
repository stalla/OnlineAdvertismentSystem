package com.lavanya.designpatterns.af;

import com.lavanya.designpatterns.builder.Offer;
import com.lavanya.designpatterns.builder.OfferType;

public abstract class AbstractOfferFactory {
	public abstract Offer createOffer(OfferType type);

}
