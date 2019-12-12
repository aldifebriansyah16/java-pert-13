package com.tutorial;
/**
 *
 * @author USER
 * Nama     : Aldi Febriansyah
 * Kelas    : TI-B
 * NIM      : A2.1900015
 */
public class Main {
    public static void main ( String[] args ){
        // tipe data di java:
        // integer, byte, short, long, double, float, char, boolean
        
        // integer (unit)
        int i = 10 ;
        System.out.println( " ===== INTEGER ===== " );
        System.out.println( " Nilai integer i = " + (i + 1));
        System.out.println( " Nilai max = " + Integer . MAX_VALUE );
        System.out.println( " Nilai min = " + Integer . MIN_VALUE );
        System.out.println( " Besar integer = " + Integer . BYTES + " byte " );
        System.out.println( " Besar integer = " + Integer . SIZE + " bit " );
        
        //byte (satuan)
        byte b = 10;
        System.out.println( " ===== BYTE ===== " );
        System.out.println( " Nilai byte b = " + b);
        System.out.println( " Nilai max = " + Byte . MAX_VALUE );
        System.out.println( " Nilai min = " + Byte . MIN_VALUE );
        System.out.println( " Besar integer = " + Byte . BYTES + " byte " );
        System.out.println( " Besar integer = " + Byte . SIZE + " bit " );
        
        //short (satuan)
        short s = 10;
        System.out.println( " ===== SHORT ===== " );
        System.out.println( " Nilai short s = " + s);
        System.out.println( " Nilai max = " + Short . MAX_VALUE );
        System.out.println( " Nilai min = " + Short . MIN_VALUE );
        System.out.println( " Besar short = " + Short . BYTES + " byte " );
        System.out.println( " Besar short = " + Short . SIZE + " bit " );
        
        //long (satuan)
        long l = 10L;
        System.out.println( " ===== LONG ===== " );
        System.out.println( " Nilai long l = " + l);
        System.out.println( " Nilai max = " + Long . MAX_VALUE );
        System.out.println( " Nilai min = " + Long . MIN_VALUE );
        System.out.println( " Besar long = " + Long . BYTES + " byte " );
        System.out.println( " Besar long = " + Long . SIZE + " bit " );
        
        //double (satuan)
        double d = -10.5d;
        System.out.println( " ===== DOUBLE ===== " );
        System.out.println( " Nilai double i = " + d);
        System.out.println( " Nilai max = " + Double . MAX_VALUE );
        System.out.println( " Nilai min = " + Double . MIN_VALUE );
        System.out.println( " Besar double = " + Double . BYTES + " byte " );
        System.out.println( " Besar double = " + Double . SIZE + " bit " );
        
        //float (koma, bilangan asli)
        float f = -8.5f;
        System.out.println( " ===== FLOAT ===== " );
        System.out.println( " Nilai float f = " + f);
        System.out.println( " Nilai max = " + Float . MAX_VALUE );
        System.out.println( " Nilai min = " + Float . MIN_VALUE );
        System.out.println( " Besar float = " + Float . BYTES + " byte " );
        System.out.println( " Besar float = " + Float . SIZE + " bit " );
        
        //char (karakter)
        char c = 'c';
        System.out.println( " ===== CHAR =====" );
        System.out.println( " Nilai char i = " + c);
        System.out.println( " Nilai max = " + Character . MAX_VALUE );
        System.out.println( " Nilai min = " + Character . MIN_VALUE );
        System.out.println( " Besar char = " + Character . BYTES + " byte " );
        System.out.println( " Besar char = " + Character . SIZE + " bit " );
        
        //boolean (nilai true atau false)
        boolean val = false;
        System.out.println( " ===== BOOLEAN ===== " );
        System.out.println( " Nilai boolean val = " + (i + 1));
        System.out.println( " Nilai max = " + Boolean . TRUE );
        System.out.println( " Nilai min = " + Boolean . FALSE );       
    }
    
}
