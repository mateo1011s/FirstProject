package com.example.proyectonuevo;

import java.util.Scanner;
public class newProjectNum {

    public static void main (String [] args){
        int number1;
        int number2;

        System.out.println("Enter the first number");
        Scanner num1 = new Scanner (System.in);
        number1 = num1.nextInt();
        System.out.println("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        number2 = num2.nextInt();
        int resultSumNumber1andNumber2 = number1 + number2;
        System.out.println("The result of sum is: " + resultSumNumber1andNumber2);
        double resultDivisionNumber1andNumber2 = (double) number1 /number2;
        System.out.println("The result of division is: " + resultDivisionNumber1andNumber2);
        System.out.println("Thanks for using :)");
    }
}