package random;

import java.util.Scanner;
import java.util.TreeSet;


public class Generate_Random_Numbers {
	
	
	public static void main(String[] args) {
		
		//setting up the range of our random numbers
		int upperBound = 1000;
		int lowerBound = 1;
		
		//Creating an ArrayList to store our random integers
		TreeSet<Integer> randomSet = new TreeSet<Integer>();
		
		//setting up the while loop and putting our formula to generate 500 random numbers inside the loop
		while(randomSet.size() != 500 ) {
					int randomInteger = (int) Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound);

					//adding all the random numbers in the arrayList one by one, while the loop runs
					randomSet.add(randomInteger);
		}
		
		
		//Printing the total set on the console
		System.out.println("The random numbers are: " + randomSet);
		
		//Making sure the ArrayList contains 500 values
		System.out.println("Total random numbers found: " + randomSet.size());
		
		//converting our set into an object array, so that we can get individual element using its index number
		Object[] myArray= randomSet.toArray();
		
		//printing a statement on the console
		System.out.print("Enter the number position you want: ");
		
		//Taking userinput from the user and saving it as an integer
		Scanner userInput = new Scanner(System.in);
		int input= userInput.nextInt();
		
		//finally using the user input as an index value for our array to get the corresponding element
		//index for the first element starts at 0. So we always have to deduct 1 to get the exact element user wants
		System.out.print("The number at that position is: " + myArray[input -1]);
	}
}
