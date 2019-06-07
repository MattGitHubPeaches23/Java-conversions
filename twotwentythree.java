// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to convert string telephone number 9843438475 into (984) 343-8475
   p.75 p2.23
 */
import java.util.Random;

public class twotwentythree {
	
	public static void main(String[] args) {
		
		//Generate random phone number to convert
		Random r = new Random();
		String phoneNum = "";
		//Pull random number for test
		for(int i = 0; i < 10; ++i) {
			int randNum = r.nextInt(9);			
			phoneNum = phoneNum + randNum;				
		}
		
		System.out.println(phoneNum);
		
		//Connect the dots and 
		String combo = "(" + phoneNum.substring(0, 3) + ") " + phoneNum.substring(3, 6)
						+ "-" + phoneNum.substring(6, 10);
		
		System.out.println(combo);
		
	}
}
