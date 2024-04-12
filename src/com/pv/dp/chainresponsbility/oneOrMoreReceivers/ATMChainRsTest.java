package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

import java.util.Scanner;

public class ATMChainRsTest {
    public static void main(String[] args) {
        System.out.println("Enter your Amount :");
        Scanner scanner = new Scanner(System.in);
        long amount = scanner.nextLong();
        ATM atm = new ATM();
        long remainingAmountOfFive = amount % 5;
        if(remainingAmountOfFive > 0){
            System.out.println("The ATM cannot fulfill your request as it does not dispense currency denominations below 5 Rs.");
        }else {
            atm.withdraw(amount);
        }

    }
}
