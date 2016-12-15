package com.company;
        import java.util.Random; //import dari java untuk Random

public class Main {
    public static void main(String[] args) {

        Random acak = new Random(); // membuat angka acak

        int n = acak.nextInt();
        System.out.println("n = " + n);

        if (n < 0)
            System.out.println("Nilai angka bernilai Negatif");

        System.out.println ("Selamat Jalan") ;
    }
}
