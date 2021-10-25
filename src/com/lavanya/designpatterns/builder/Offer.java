package com.lavanya.designpatterns.builder;

public class Offer {
	String name;
	int offerInPercentage;
	OfferType type;
	
	private Offer(OfferBuilder builder) {
		this.name = builder.name;
		this.offerInPercentage = builder.offerInPercentage;
		this.type = builder.type;
	}
	
	public static class OfferBuilder {
		String name;
		int offerInPercentage;
		OfferType type;
		
		public OfferBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public OfferBuilder withOfferInPercenetage(int offerInPercentage ) {
			this.offerInPercentage = offerInPercentage;
			return this;
		}
		
		public OfferBuilder withType(OfferType type) {
			this.type = type;
			return this;
		}
		
		//actual build method to build an Offer
		public Offer build() {
			return new Offer(this);
		}
	}

	public String getName() {
		return name;
	}

	public int getOfferInPercentage() {
		return offerInPercentage;
	}

	public OfferType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Offer [name=" + name + ", offerInPercentage=" + offerInPercentage + ", type=" + type + "]";
	}
	
	
}
