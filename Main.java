package com.Levelone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperature;
        String unitOfTheTemperature;
        String choice;
        Scanner temp = new Scanner(System.in);
        do {
            System.out.println("Enter the Temperature:");
            temperature = temp.nextDouble();
            System.out.println("Enter The Unit Of The Temperature C or F");
            unitOfTheTemperature= temp.next();
            if (unitOfTheTemperature.equalsIgnoreCase("C")) {
                double fahrenheit = ((temperature * 9 / 5) + 32);
                System.out.println("Converted temperature=" + fahrenheit + "  fahrenheit");
            } else if (unitOfTheTemperature.equalsIgnoreCase("F")) {
                double celcius = ((temperature - 32) * 5 / 9);
                System.out.println("Converted temperature=" + celcius + "  celcius");
            } else {
                System.out.println("Invalid unit. Please enter C or F only.");
            }
        System.out.print("Do you want to convert another temperature? (yes/no): ");
        choice = temp.next();}
        while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the Temperature Converter!");
        temp.close();
    }
}