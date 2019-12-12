package com.tutorial;
/**
 * @author USER
 * Nama      : Aldi Febriansyah
 * Kelas     : TI-B
 * NIM       : A2.1900015
 */
import java.util.*;
public class Main {
    public static void main( String[] args ){
        
        // membuat sebuat objek untuk menangkap innput dari user
        Scanner inputUser = new Scanner(System.in);
        
       // sebuah program sederhana untuk menbak sebuah angka
       int nilaiBenar = 6;
       int nilaiTebakan;
       boolean statusTebakan;
       
       System.out.print("masukan nilai tebakan anda: ");
       nilaiTebakan = inputUser.nextInt();
       System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);
       
       //operasi logika
       statusTebakan = (nilaiTebakan == nilaiBenar);
       System.out.println("Tebakkan anda: " + statusTebakan);
       
       //operasi aljabar boolean(and / or)
       System.out.println("masukan nilai diantara 4 dan 9: ");
       nilaiTebakan = inputUser.nextInt();
       
       statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
       
       
       /*
        a | b | c
        0   0   0
        0   1   0
        1   0   0
        1   1   1
       */   
       System.out.println("tebakan anda: " + statusTebakan);
    }
    
}
