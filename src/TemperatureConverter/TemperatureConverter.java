package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
		public static void main(String[] args) {
				System.out.println("This program converts Fahrenheit temperature to Celsius temperature.");
				System.out.print("Enter the Fahrenheit temperature to convert: ");
				Scanner input = new Scanner(System.in);
				double f, c;
				f = input.nextInt();
				
				c = (f-32)*5/9;
				System.out.println("Celsius temperature: " + c);
				
				input.close();
				
		}

}