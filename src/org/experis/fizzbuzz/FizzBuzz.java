package org.experis.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            String result;
            String printLine;

            if( i % 15 == 0){
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            }else{
                result = String.valueOf(i);
            }

        }
    }
}
