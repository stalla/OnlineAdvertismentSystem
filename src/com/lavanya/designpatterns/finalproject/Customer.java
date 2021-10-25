package com.lavanya.designpatterns.finalproject;

public class Customer {
	String name;
	CategoryType categoryType;
	
	public Customer(String name, CategoryType categoryType) {
		super();
		this.name = name;
		this.categoryType = categoryType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}
	
	
}
