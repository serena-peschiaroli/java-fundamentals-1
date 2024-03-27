package org.experis.cibi;

public class CalcolaCibi {
    public static void main(String[] args) {
        // inizializza l'array string con i cibi favoriti
        String[] favoriteFoods = {"Gelato", "Amatriciana", "Cioccolato Fondente", "Patate fritte", "Occhi di bue", "Pizza", "Sushi","Burritos" };

        //stampa la lunghezza della classifica
        System.out.println("the length of the raanking is: " + favoriteFoods.length);

        //stampa il cibo top
        System.out.println("My top food is: " + favoriteFoods[0]);

        //stampa l'ultimo elemento della lista
        System.out.println("My last favourite food is: " + favoriteFoods[favoriteFoods.length - 1]);

        //elemento in posizione mediana:

        int medianPosition = favoriteFoods.length / 2;

        System.out.println("the food in the middle of the ranking is: " + favoriteFoods[medianPosition]);




    }
}
