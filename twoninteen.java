// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to convert numbers(1-12) into month names, ie "January, February, ect
   p.74 p2.19
 */

import java.util.Random;

public class twoninteen {
	public static void main(String[] args) {
		
		//Create long string of months
		String months = "January   February  March     April     May       June      "
				+ "July      August    September October   November  December  ";
		
		//Will get random number and give out month name
		Random r = new Random();
		//Pull random number for test
		for(int i = 0; i < 20; ++i) {
			int randNum = r.nextInt(12) + 1;
			System.out.println(randNum);
			
			//Find the correct spot in string months
			int find;			
			if(1 != randNum) {find = (randNum * 10) - 11;}
			else {find = 0;}
			System.out.println(find);
			
			//Print out month name of random number pulled
			String sub = months.substring(find,find + 10);
			System.out.println(sub);
		}
		
		
	}
}
