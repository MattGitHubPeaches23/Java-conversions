// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to take in the amount due and the amount payed, then give change back
   p.75 p2.25
 */

import java.util.Scanner;
public class twotwentyfive {

	

	public static void main(String[] args) {
		
		//Enter amount due and amount received
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter the ammount due : ");
		
		int due = in.nextInt();
		
		System.out.print("Enter the ammount recieved in pennies : ");
		
		int pennies = in.nextInt();
		
		System.out.println("Ammount due = " + due + "  Ammount recieved = " + pennies) ;
		
		//Calculate amount due
		int change = pennies - due;
		System.out.println("Change = " + change);
		
		//Calculate dollars due
		int dollarsDue = change / 100;
		System.out.println("dollarsDue = " + dollarsDue);
		
		//Calculate quarters due
		int changeDue = change - dollarsDue*100;
		//System.out.println("changeDue = " + changeDue);
				
		int quarterDue = changeDue / 25;
		System.out.println("quartersDue = " + quarterDue);
		
		//Calculate dimes due
		changeDue = changeDue - quarterDue*25;
		int dimesDue = changeDue / 10;
		System.out.println("dimesDue = " + dimesDue);

		//Calculate nickel due
		changeDue = changeDue - dimesDue*10;
		int nickleDue = changeDue / 5;
		System.out.println("nickleDue = " + nickleDue);
		
		//Calculate pennies due
		changeDue = changeDue - nickleDue*5;
		int penniesDue = changeDue / 1;
		System.out.println("penniesDue = " + penniesDue);
		
		
		
	}	
}
