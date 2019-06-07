// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to simulate car purchase p.72 p2.10
 */
import java.util.Scanner;
public class twoTen {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		//Enter values for Hybrid Car
		System.out.println("Enter the Values for a Hybrid Car.");
		
		System.out.println("Enter the cost of a car : ");
		
		int costH = in.nextInt();
		System.out.println("Cost of a car : " + costH);
		
		System.out.println("Enter estimated miles driven per year : ");
		int milesPerYearH = in.nextInt();
		System.out.println("Estimated miles driven per year : " + milesPerYearH);
		
		System.out.println("Enter the approximate gas price : ");
		double gasPriceH = in.nextDouble();
		System.out.println("Estimated gas price : " + gasPriceH);
		
		System.out.println("Enter efficiency in miles per gallon : ");
		int milesPerGallonH = in.nextInt();
		System.out.println("Efficiency in  miles per gallon : " + milesPerGallonH);
		
		System.out.println("Enter estimated resale value after five years : ");
		int resaleValueH = in.nextInt();
		System.out.println("Estimated resale value : " + resaleValueH);		
		
		//Calculate cost of Hybrid Car
		double dollPerMileH = (double) gasPriceH /  (double) milesPerGallonH ;
		System.out.println("Dollar per mile : " + dollPerMileH);
			
		double totalCostH = (costH + ((milesPerYearH * dollPerMileH)*5)) - resaleValueH;
		
		
		
		
		//Enter values of non-hybrid car
		System.out.println("Enter the Values for a non-Hybrid Car.");
		
		System.out.println("Enter the cost of a car : ");
		
		int cost = in.nextInt();
		System.out.println("Cost of a car : " + cost);
		
		System.out.println("Enter estimated miles driven per year : ");
		int milesPerYear = in.nextInt();
		System.out.println("Estimated miles driven per year : " + milesPerYear);
		
		System.out.println("Enter the approximate gas price : ");
		double gasPrice = in.nextDouble();
		System.out.println("Estimated gas price : " + gasPrice);
		
		System.out.println("Enter efficiency in miles per gallon : ");
		int milesPerGallon = in.nextInt();
		System.out.println("Efficiency in  miles per gallon : " + milesPerGallon);
		
		System.out.println("Enter estimated resale value after five years : ");
		int resaleValue = in.nextInt();
		System.out.println("Estimated resale value : " + resaleValue);	
		
		
		//Compute cost of non-hybrid car
		double dollPerMile = (double) gasPrice /  (double) milesPerGallon ;
		System.out.println("Dollar per mile : " + dollPerMile);
			
		double totalCost = (costH + ((milesPerYear * dollPerMile)*5)) - resaleValue;
		
		//Display cost comparison
		System.out.print("Estimated cost of non-Hybrid car after five years :  $");
		System.out.printf("%.2f", totalCost);
		
		System.out.print("Estimated cost of Hybrid car after five years :  $");
		System.out.printf("%.2f", totalCostH);
		
		
		
	}
}
