package com.tutorial;
/**
 * @author USER
 * Nama     : Aldi Febriansyah
 * Kelas    : TI-B
 * NIM      : A2.1900015
 */ 
public class Main {
    public static void main( String[] args ){
        
    // Operator Komparasi ... ini akan menghasilkan nilai dalam  bentuk boolean
    
    int a, b;
    boolean hasilKomparasi ;
    
    //operator sama atau persamaan
    System.out.println("---- PERSAMAAN");
    a = 10;
    b = 10;
    hasilKomparasi = (a == b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 12;
    b = 10;
    hasilKomparasi = (a == b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    //operator tidak sama atau pertidaksamaan
    System.out.println("---- PERTIDAKSAMAAN");
    a = 10;
    b = 10;
    hasilKomparasi = (a != b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 12;
    b = 10;
    hasilKomparasi = (a != b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    //operator kurang dari atau kurang dari
    System.out.println("---- KURANG DARI ");
    a = 9;
    b = 10;
    hasilKomparasi = (a < b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 12;
    b = 10;
    hasilKomparasi = (a < b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    //operator lebih besar dari atau kurang dari
    System.out.println("---- LEBIH DARI ");
    a = 9;
    b = 10;
    hasilKomparasi = (a > b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 12;
    b = 10;
    hasilKomparasi = (a > b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    //operator kurang dari sama atau kurang dari sama dengan
    System.out.println("---- KURANG DARI SAMA DENGAN ");
    a = 9;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 10;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 12;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    //operator lebih besar dari sama atau lebih dari sama dengan
    System.out.println("---- LEBIH DARI SAMA DENGAN ");
    a = 9;
    b = 10;
    hasilKomparasi = (a >= b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 10;
    b = 10;
    hasilKomparasi = (a >= b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    
    a = 12;
    b = 10;
    hasilKomparasi = (a >= b);
    System.out.printf("%d == %d -->%s \n",a,b, hasilKomparasi);
    }
}
