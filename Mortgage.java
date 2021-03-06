package com.perscholas.interest;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int principal = input.nextInt();

        System.out.print("Enter Interest Rate: ");
        double interestRate = input.nextFloat();
        double monthlyInterest = interestRate / 100 / 12;

        System.out.print("Enter Period in years: ");
        byte years = input.nextByte();
        int numberOfPayments = years * 12;

        double monthlyPayment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String monthlyPayForm = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        String totalPayForm = NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments);


        System.out.println("Your Monthly Payment is: " + monthlyPayForm);
        System.out.println("Your Total cost is: " + totalPayForm);
    }
}