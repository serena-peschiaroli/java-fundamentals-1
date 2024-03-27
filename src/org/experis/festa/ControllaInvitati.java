package org.experis.festa;

import java.util.Scanner;

public class ControllaInvitati {
    public static void main(String[] args) {
        //inizializza  lista invitati
        String[] inviteesList = {
                "Dua Lipa", "Paris Hilton", "Manuel Agnelli"," J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"

        };
        //creare scanner per leggere user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the party! What's your name?");
        String userName = scanner.nextLine().trim();

        //eseguire un loop per cercare userName nella lista degli invitati con un check case-insensitive
        boolean isInviteeFound = false;

        /* sintassi enhanced foor loop: for (String element : array) {
                                            System.out.println(element);
                                         } */
        for (String invitee : inviteesList) {
            //case-insensitive checks
            if (invitee.equalsIgnoreCase(userName)) {
                isInviteeFound = true;
                //esci dal ciclo se trovato
                break;
            }
        }

        //se userName è nella lista degli invitati:
        if(isInviteeFound){
            System.out.println("welcome to the party, " + userName + "!");
        }else{
            System.out.println("sorry, " + userName + ", you're not on the list.");
        }

        scanner.close();
    }

}
