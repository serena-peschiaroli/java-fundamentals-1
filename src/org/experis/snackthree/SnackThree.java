package org.experis.snackthree;

import java.util.Scanner;

public class SnackThree {
    public static void main(String[] args) {
        //Snack 3: data una stringa inserita dall’utente contare quante volte appare il carattere ‘a’ (minuscolo o maiuscolo)

        //dichiaro lo scanner
        Scanner scan = new Scanner(System.in);
        //chiedo input ad utente
        System.out.println("Inserisci una stringa: ");
        String userInput = scan.nextLine().trim();
        System.out.println("Hai inserito: " + userInput);
        String userInputToLower = userInput.toLowerCase();

        //array di caratteri:
        char[] characters = userInputToLower.toCharArray();

        //inizializzo il contatore;

        int count = 0;
        int i = 0;
        // iterare attraverso ogni carattere dell'array con un while
        while (i < characters.length) {
            if (characters[i] == 'a') {
                //aggiorna contatore
                count++;
            }
            i++;
        }
        System.out.println("Il carattere 'a' appare  nella tua stringa " + count + " volte");

    }
}
