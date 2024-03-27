package org.experis.treno;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        // creare scanner obj per prendere input
        Scanner scanner = new Scanner(System.in);
        //chiedere user input
        System.out.println("Kindly insert total kms");
        double kilometers = scanner.nextDouble();
        System.out.println("Km: " + kilometers);

        System.out.println("Please insert passengers' age");
        int age = scanner.nextInt();

        //calcolare prezzo base
        double pricePerKm = 0.21;
        double totalPrice = kilometers * pricePerKm;
        System.out.println("Total price: " + totalPrice);

        double discountRate = 0;

        //calcolare scontistica in base ad age
        if(age < 18){
            //20% sconto per i minorenni
            discountRate = 0.20;

        } else if (age > 65) {
            //40% di sconto per i pensionati
            discountRate = 0.40;

        }

        //applicare la scontistica

        if(discountRate > 0){
            double discountAmount = totalPrice * discountRate;
            totalPrice -= discountAmount;
            /*Formatters: %.0f%% x floating numbers con zero decimali + segno % ;  %d x integer;  €%.2f floating number con due decimali + simbolo euro */
            System.out.printf("Applying a %.0f%% discount for age %d, Discount Amount: €%.2f\n", discountRate * 100, age, discountAmount);

        }

        //arrotondare a due decimali
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;

        //stampre il prezzo finale

        System.out.printf("Passenger is %d years old, Total Price: €%.2f\n", age, totalPrice);
        //chiudo scanner
        scanner.close();
    }
}
