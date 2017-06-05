/*
Programmer: Justin Doggett
Date: 5/19/2017
Description: This program asks the user to enter an object's mass, and then calculates its weight.
             If the object weighs more than 1000 Newtons, display a message indicating it's too heavy.
             If the object weighs less than 10 Newtons, display a message indicating it's too light.
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MassAndWeight
{
	public static void main(String [] args)
	{
		JOptionPane.showMessageDialog(null, "Welcome to the Mass and Weight Program");

		//calls the function CalculateMassAndWeight
		CalculateMassAndWeight();
    }

		public static void CalculateMassAndWeight()
		{
			//variable declarations
					double mass;
					double weight;

					//Create a Scanner object for reading input
					Scanner keyboard = new Scanner(System.in);

					//Prompt the user to enter the mass of an object
					System.out.println("Please enter the object's mass.");
					mass = keyboard.nextDouble();

					//Calculate the weight
					weight = mass * 9.8;

					//Determine if the object is too heavy, too light, or within range
					if(weight > 1000)
					{
						System.out.println("The weight is: " + weight);
						System.out.println("The object is too heavy");
					}
					else if (weight < 10)
					{
						System.out.println("The weight is: " + weight);
						System.out.println("The object is too light.");
					}
					else
					{
						System.out.println("The weight is: " + weight);
						System.out.println("The object's weight is in range.");
					}
			}
}





