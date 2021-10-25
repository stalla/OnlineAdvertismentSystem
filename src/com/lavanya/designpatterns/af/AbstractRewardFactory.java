package com.lavanya.designpatterns.af;

import com.lavanya.designpatterns.builder.Reward;
import com.lavanya.designpatterns.builder.RewardType;

public abstract class AbstractRewardFactory {
	public abstract Reward createReward(RewardType type);
}
