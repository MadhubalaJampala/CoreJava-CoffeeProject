package org.perscholas.corejava.miniproject;

import java.util.Scanner;

public class VirtualCoffeeMachine {

	//static final int WATER = 200, MILK = 50, COFFEEBEANS = 15;
	static int water = 400, milk = 540, coffeeBeans = 120, dispCups = 9;
	static double money = 550.0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
// Calling the method for stage 2 of the project
//		int actualWater = 0, actualMilk = 0, actualCoffeeBeans = 0;
//		System.out.println("How many cups of coffee you will need?");
//		noOfCups = scan.nextInt();
//		needCoffee(noOfCups);

		System.out.println("Write action (buy, fill, take, remaining, exit):");
		String message = scan.next();
		while (!(message.equalsIgnoreCase("exit"))) {
			switch (message) {
			case "buy":
				buyCoffee();
				break;
			case "fill":
				fillCoffee();
				break;
			case "take":
				takeCoffee();
				break;
			case "remaining":
				printCoffee();
				break;
			default:
				System.out.println("Invalid Input.Try Again.");
			}
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			message = scan.next();
		}
//calling the method for stage 3 of the project
//					needCoffee();
		System.out.println("Good Bye!");
		scan.close();
	}

	public static void buyCoffee() {
		System.out.println("What do you want to buy?");
		System.out.println("1.Espresso\n2.Latte\n3.Cappuccino");
		System.out.println("back - to main menu :");
		String choice = scan.next();
		switch (choice) {
		case "1":
			if (dispCups <= 0)
				System.out.println("Sorry,not enough disposable cups!");
			else if (water < 250)
				System.out.println("Sorry, not enough water!");
			else if (coffeeBeans < 16)
				System.out.println("Sorry, not enough coffee beans!");
			else {
				System.out.println("I have enough resources making you a cofee!");
				water -= 250;
				coffeeBeans -= 16;
				money += 4;
				dispCups -= 1;
			}
			break;
		case "2":
			if (dispCups <= 0)
				System.out.println("Sorry,not enough disposable cups!");
			else if (water < 350)
				System.out.println("Sorry, not enough water!");
			else if (milk < 75)
				System.out.println("Sorry, not enough milk!");
			else if (coffeeBeans < 20)
				System.out.println("Sorry, not enough coffee beans!");
			else {
				System.out.println("I have enough resources making you a cofee!");
				water -= 350;
				milk -= 75;
				coffeeBeans -= 20;
				money += 7;
				dispCups -= 1;
			}
			break;
		case "3":
			if (dispCups <= 0)
				System.out.println("Sorry,not enough disposable cups!");
			else if (water < 200)
				System.out.println("Sorry, not enough water!");
			else if (milk < 100)
				System.out.println("Sorry, not enough milk!");
			else if (coffeeBeans < 12)
				System.out.println("Sorry, not enough coffee beans!");
			else {
				System.out.println("I have enough resources making you a cofee!");
				water -= 200;
				milk -= 100;
				coffeeBeans -= 12;
				money += 6;
				dispCups -= 1;
			}
			break;
		case "back":
			break;
		default:
			System.out.println("Invalid Input.");
		}
	}

	public static void fillCoffee() {
		System.out.println("How many ml of water you want to add:");
		water += scan.nextInt();
		System.out.println("How many ml of milk you want to add:");
		milk += scan.nextInt();
		System.out.println("How many grams of coffee beans you want to add:");
		coffeeBeans += scan.nextInt();
		System.out.println("How many disposable cups you want to add:");
		dispCups += scan.nextInt();
		// printCoffee();
	}

	public static void takeCoffee() {
		System.out.println("I gave you $" + money);
		money = 0.0;
		// printCoffee();
	}

	public static void printCoffee() {
//		System.out.println("Starting to make a coffee\n");
//		System.out.println("Grinding coffee beans \nBoiling Water\nMixing boiled water with "
//				+ "crushed coffee beans\nPouring coffee into cup\nPouring some milk into"
//				+ "nthe cup\n\nCoffee is ready!");
		System.out.println("\nThe coffee machine has:\n");
		System.out.println(water + " ml of water");
		System.out.println(milk + " ml of milk");
		System.out.println(coffeeBeans + " grams of coffee beans");
		System.out.println(dispCups + " of disposable cups");
		System.out.println("$" + money + " of money\n");
	}

// This function satisfies the Stage 2 of the project by displaying the 
// the amount of resources required for n number of cups.
	/*
	 * public static void needCoffee(int noOfCups) { int reqdWater =0, reqdMilk =0,
	 * reqdCoffeeBeans =0; reqdWater = WATER * noOfCups; reqdMilk = MILK * noOfCups;
	 * reqdCoffeeBeans = COFFEEBEANS * noOfCups;
	 * System.out.println("For "+noOfCups+" cups of coffee you will need:");
	 * System.out.println("\n"+reqdWater+" ml of water");
	 * System.out.println(reqdMilk+" ml of milk");
	 * System.out.println(reqdCoffeeBeans+" g of coffee beans"); }
	 */
	
//This function satisfies the Stage 3 of the project by displaying
// if the coffee machine has enough resources or not.

/*	public static void needCoffee() {
		int actualWater =0,actualMilk=0,actualCoffeeBeans=0,noOfCups=0;
		int n = 0;
		System.out.println("Write how many ml of water the coffee machine has:");
		actualWater = scan.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		actualMilk = scan.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		actualCoffeeBeans = scan.nextInt();
		System.out.println("How many cups of coffee you will need?");
		noOfCups = scan.nextInt();
		while (actualWater >= 200 && actualMilk >= 50 && actualCoffeeBeans >= 15) {
			actualWater -= 200;
			actualMilk -= 50;
			actualCoffeeBeans -= 15;
			n++;
		}
		if (n == noOfCups)
			System.out.println("Yes,I can make that amount of coffee.");
		else if (n < noOfCups)
			System.out.println("No, I can make only " + n + " cup(s) of coffee.");
		else if (n > noOfCups)
			System.out.println("Yes,I can make that amount of coffee(and even " + (n - noOfCups) + " more than that)");
	}*/
}


