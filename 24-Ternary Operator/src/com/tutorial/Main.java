package com.tutorial;
/**
 * @author USER
 * Nama     : Aldi Febriansyah
 * Kelas    : TI-B
 * NIM      : A2.1900015
 */
import java.util.*;
public class Main {
    public static void main( String[] args ){  
        
        // Ternary operator
        
        int input, x;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.printf("Masukan nilai: ");
        input = inputUser.nextInt();
        
        //variabel x = ekspesi ? statement_true : statement_false
        
        x = (input == 10) ? (input*input) : (input/2);
        
//      jika memekai if
//      if (input==10){
//          x = input*input;
//          }else{
//              x = input/2
//          }
        System.out.println("hasilnya " + x);
    }  
}
