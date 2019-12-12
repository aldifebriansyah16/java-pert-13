package com.tutorial;
/**
 * @author USER
 * Nama     : Aldi Febriansyah
 * Kelas    : TI-B
 * NIM      : A2.1900015
 */
import java.util.Scanner;
public class Main {
    public static void main( String[] args ){
        
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        //Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang + lebar
        
        System.out.println("MENGHITUNG LUAS");
        System.out.printf("panjang = 2 ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        
        luas = panjang + lebar;
        System.out.println("Luas = " + luas);
        
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi =");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }
    
}
