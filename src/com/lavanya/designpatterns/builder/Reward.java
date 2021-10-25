package com.lavanya.designpatterns.builder;

public class Reward {
	String name;
	RewardType type;
	
	private Reward(RewardBuilder builder) {
		this.name = builder.name;
		this.type	= builder.type;
	}
	
	public static class RewardBuilder {
		String name;
		RewardType type;
		
		public RewardBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public RewardBuilder withRewardType(RewardType type) {
			this.type = type;
			return this;
		}
		
		public Reward build() {
			return new Reward(this);
		}
	}
}
