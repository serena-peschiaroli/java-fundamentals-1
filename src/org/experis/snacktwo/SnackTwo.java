package org.experis.snacktwo;

import java.util.Random;

public class SnackTwo {
    public static void main(String[] args) {
        String[] names = {"Giuseppe\tMongelli", "Giulio\tD'Angelo", "Roberto\tBenfini",
                "Salvatore\tBono", "Umberto Maria\tFaenza", "Massimo\tAzzini", "Alessandro\tCingolani",
                "Giuseppe\tGerace", "Alessandro\tMatricardi", "Alessandro\tPirisinu",
                "Salvatore Dario\tTorrisi", "Valerio\tCarbone", "Edoardo\tCicognani", "Gabriel\tD'Amico",
                "Francesco\tCarrara", "Vinicius\tDe Miranda", "Davide\tGila", "Luca\tMasera",
                "Mekki\tOuertani", "Matteo\tPupino", "Alberto\tStizzoli", "Cristian\tUrsino",
                "Luca\tMincuzzi", "Serena\tPeschiaroli"};
        // System.out.println(Arrays.toString(names));

        Random randomGenerator = new Random();
        System.out.println("Test per random generator con buond a 100: " + randomGenerator.nextInt(100));
        // genera un index random contenuto nella lunghezza dell'array
        int randomIndex = randomGenerator.nextInt(names.length);
        System.out.println("Indice random: " + randomIndex);
        // usa l'index per estrarre un elemento random
        String randomName = names[randomIndex];
        System.out.println("Nome Random. " + randomName);
    }
}
