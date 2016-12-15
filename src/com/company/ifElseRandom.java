package com.company;

import java.util.Random;

public class ifElseRandom {
    public static void main(String[] args){
        Random random = new Random(); // Membuat nilai random

        int m = random.nextInt(); // mengacak nilai m
        System.out.println("m= " + m); // menampilkan nilai m

        int n = random.nextInt(); // mengacak nilai n
        System.out.println("n= " + n); // menampilkan nilai n

        if (m < n) //persyaratan
            System.out.println("Nilai terkecil adalah nilai m yaitu " + m); //jika benar
        else
            System.out.println("Nilai adalah adalah nilai n yaitu " + n); //jika salah
    }
}
