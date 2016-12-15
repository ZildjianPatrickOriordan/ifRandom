package com.company;

public class SwitchSederhana {
    public static void main(String[] args) {
        int A = 4; // pilihan Case
        System.out.print("Anda mahasiswa jurusan :  ");

        switch (A){

            case 1 :
                System.out.println("Sistem Informasi");
                break;
            case 2 :
                System.out.println("Manajemen Informatika");
                break;
            case 3 :
                System.out.println("Teknik Elektro");
                break;
            case 4 :
                System.out.println("Matematika Terapan");
                break;
            case 5 :
                System.out.println("Teknik Industri");
                break;
        }
    }
}
