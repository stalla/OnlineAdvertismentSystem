package com.lavanya.designpatterns.finalproject;

import java.io.Console;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.lavanya.designpatterns.builder.Offer;
import com.lavanya.designpatterns.builder.OfferType;
import com.lavanya.designpatterns.singleton.MyLogger;

import java.util.Scanner;

public class Main {
	private  static final MyLogger logger = MyLogger.getInstance();

	static Map<String, Offer> currentOffers = new HashMap<String, Offer>();
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		logger.writeMessage("Online Advertising Demo...");
		displayMenu();
	}
	
	private static void showExistingOffers() {
		if(currentOffers.size() < 1) {
			System.out.println("There are no current offers");
			displayMenu();
		}
		
		for (Entry<String, Offer> entry : currentOffers.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
		
		System.out.println();
		
		displayMenu();
		
	}

	private static void displayCreatePromotion() {
		char addAnotherOffer;
		
		do {
			System.out.println("Enter a Category a) Fast Food b)Drinks c)Retail");
			
			String categoryType = console.nextLine();
			CategoryType customerCategory;
			
			
			switch(categoryType) {
			case "a":
				customerCategory = CategoryType.FAST_FOOD;
				break;
			case "b":
				customerCategory = CategoryType.DRINKS;
				break;
			case "c":
				customerCategory = CategoryType.RETAIL;
				break;
			default:	
				customerCategory = CategoryType.FAST_FOOD;
				break;
	
			}
			
			System.out.println("Enter a customer name, e.g Burger King, Star Bucks, or Kohls");
			String customerName = console.nextLine();
			
			//create customer
			Customer customer = new Customer(customerName, customerCategory);
			
			System.out.println("Enter offer details");
			System.out.println("Name of the offer");
			String offerName = console.nextLine();
			System.out.println("Enter discount as percentage");
			int discount = console.nextInt();
			OfferType type = OfferType.BACKTOSCHOOL;
		
			Offer offer = new Offer
					.OfferBuilder()
					.withName(offerName)
					.withOfferInPercenetage(discount)
					.withType(type).build();
		
			currentOffers.put(customerName, offer);
		
			System.out.print("Add another offer, Enter Y for yes or N for no: ");
	        addAnotherOffer = console.next().charAt(0);
		} while((addAnotherOffer == 'y') || (addAnotherOffer == 'Y'));
		
		displayMenu();
		
	}

	public static void displayMenu() {
		
		System.out.println("1. Create a new promotion");
		System.out.println("2. Show existing promotions");
		System.out.println("3. Exit");
		
		int option = console.nextInt();
				
		switch(option) {
			case 1:
				displayCreatePromotion();
				break;
			case 2:
				showExistingOffers();
				break;
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println("You entered an invalid option");
				displayMenu();
		}
		
	}

}
