package com.techelevator;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */

import java.util.Scanner;

public class MartianWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double earthWeight, martianWeight;
		
		System.out.println("Enter a Earth weight:");
		earthWeight = input.nextDouble();
		
		martianWeight = earthWeight * 0.378;
		
		System.out.println((int)(earthWeight) + " lbs. on Earth, is " + (int)(martianWeight) + " lbs. on Mars.");
	

	}

}
