package org.experis.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //inizializza result
            String result;

            if( i % 15 == 0){
                //se numero divisibile per 3 e 5, Fizzbuzz
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                //se divisibile solo per tre, Fizz
                result = "Fizz";
            } else if (i % 5 == 0) {
                //se divisibile solo per 5, Buzz
                result = "Buzz";
            }else{
                //altrimenti, stampa numero
                //valueOf converte diversi valori in una stringa
                result = String.valueOf(i);
            }

            System.out.println(result);

        }
    }
}
