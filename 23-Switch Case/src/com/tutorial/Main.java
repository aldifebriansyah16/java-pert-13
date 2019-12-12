package com.tutorial;
/**
 * @author USER
 * Nama     : Aldi Febriansyah
 * Kelas    : TI-B
 * NIM      : A2.1900015
 */

import java.util.*;
public class Main {
    //switch case
    public static void main( String[] args ){
        String Input;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("panggil nama: ");
        Input = inputUser.next("Annisa");
        
        //ekspresinya berupa satuan (int,long,byte,short), String, atau enum
       switch("Annisa"){
           case"Jibran":
               System.out.println("Saya Jibran dan hadir Boss!!!");
               break;
           case"Aldi":
               System.out.println("Saya Aldi dan hadir Boss!!!");
               break;
           case"Yunita":
               System.out.println("Saya Yunita dan hadir Boss!!!");
               break;
           default:
               System.out.println(Input + " tidak hadir Boss!!!"); 
       }
       System.out.println("selesai program");
    }
}
