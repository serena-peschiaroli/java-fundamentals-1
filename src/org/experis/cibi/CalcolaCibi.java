package org.experis.cibi;
import java.util.Arrays;
import java.util.Scanner;

public class CalcolaCibi {
    public static void main(String[] args) {

        //creare elemento scanner
        Scanner scanner = new Scanner(System.in);

        // chiedere a user numero di cibi che vuole inserire, assicurandosi che sia fra 5 e 10
        int size = 0;
        while (size < 5 || size > 10) {
            System.out.print("how many foods do you want to enter? (min 5 and  max 10): ");
            size = Integer.parseInt(scanner.nextLine());
            if (size < 5 || size > 10) {
                System.out.println("please, enter a number between 5 and 10");
            }
        }

        // inizializzare array di cibi favoriti
        String[] favoriteFoods = new String[size];

        // chiedere all'utente posizione dei cibi
        for (int i = 0; i < favoriteFoods.length; i++) {
            System.out.print("enter food at position " + (i + 1) + ": ");
            favoriteFoods[i] = scanner.nextLine();
        }

        // Printing the array of favorite foods to confirm the input
        System.out.println("Your favorites are: " + Arrays.toString(favoriteFoods));

        //stampa la lunghezza della classifica
        System.out.println("the length of the raanking is: " + favoriteFoods.length);

        //stampa il cibo top
        System.out.println("your top food is: " + favoriteFoods[0]);

        //stampa l'ultimo elemento della lista
        System.out.println("Your last favourite food is: " + favoriteFoods[favoriteFoods.length - 1]);

        //elemento in posizione mediana con operatore ternario per cacolare se la lunghezza dell'array è pari o dispari ed aggiornare il valore di conseguenza

        int medianPosition = favoriteFoods.length % 2 == 0 ? (favoriteFoods.length / 2) - 1 : favoriteFoods.length / 2;


        System.out.println("the food in the middle of the ranking is: " + favoriteFoods[medianPosition]);




    }
}
