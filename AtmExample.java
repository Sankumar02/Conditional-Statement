package com.selection_statement;

import java.util.Scanner;

public class AtmExample
{
    public static void main(String args[])
    {
        double balance = 5000; int withdraw, deposit, money;

        Scanner atmExample = new Scanner(System.in);

            System.out.println("ATM");

            System.out.println("Welcome to HDFC");

            System.out.println("enter 1 for Withdraw");

            System.out.println("enter 2 for Deposit");

            System.out.println("enter 3 for Check Balance");

            System.out.print("Choose the operation you want to perform:");

            money = atmExample.nextInt();
            switch (money) {
                case 1:
                    System.out.print("Enter the money to be withdrawn:");
                    withdraw = atmExample.nextInt();
                    
                if (balance >= withdraw) {
          
                        System.out.println("collect the money and remove your card");
                        balance = balance - withdraw;
                        System.out.println("Balance : " + balance);
               } else {
                        
                        System.out.println("Insufficient Balance please remove your card");
                        System.out.println("Balance : " + balance);
              }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter the money to be deposited:");
                    deposit = atmExample.nextInt();
                    balance = balance + deposit;
                    System.out.println("successfully deposited");
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 3:
                    
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

            }
    }
}

