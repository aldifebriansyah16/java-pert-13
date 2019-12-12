package com.tutorial;
/**
 * @author USER
 * Nama     : Aldi Febriansyah
 * Kelas    : TI-B
 * NIM      : A2.1900015
 */
public class Main {
     public static void main (String[] args){

//        for (inisialisasi; kondisi; step nilai){
//
//        aksi;
//
//        }
        System.out.println("ini adalah awal program");

        System.out.println("loop pertama");
        for(int nilai = 0; nilai <= 10 ; nilai++){
            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("loop kedua");
        for(int nilai = 0; nilai < 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("loop ketiga");
        for(int nilai = 10; nilai >= 5 ; nilai--){
            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("loop keempat");
    }
}