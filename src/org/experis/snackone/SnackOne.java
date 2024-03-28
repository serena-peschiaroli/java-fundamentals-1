package org.experis.snackone;

public class SnackOne {
    public static void main(String[] args) {
        //dato un array di stringhe, trasformate tutti gli elementi dell’array in upper case: si deve fare con un unico ciclo for sull’array.

        String[] arrayList = {"Lorem", "ipsum", "dolor", "sit", "amet", "quoque", "neque", "quisquam"};

        for (int i = 0;  i < arrayList.length; i ++) {
            //array[i]= elemento corrente  = elemento corrente in uppercase
            arrayList[i] = arrayList[i].toUpperCase();
            System.out.println(arrayList[i]);

        }
    }
}
