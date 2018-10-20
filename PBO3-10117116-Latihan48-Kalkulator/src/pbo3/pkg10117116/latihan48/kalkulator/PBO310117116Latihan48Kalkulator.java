/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan48.kalkulator;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Kalkulator Perhitungan Aritmatika
 *  
 */
public class PBO310117116Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    
    private static double value1,value2;
    private static String note;
    
    public static void main(String[] args) {
     
        
      Scanner baca = new Scanner(System.in);
      Kalkulator objKalkulator = new Kalkulator();
      
      System.out.print("Value 1 = ");
      value1 = baca.nextDouble();
      System.out.print("Value 2 = ");
      value2 = baca.nextDouble();
      
      objKalkulator.setNameProject();
      objKalkulator.setNoteProject(note);
    
      System.out.println("Result add is = " + 
                          objKalkulator.add(value1, value2));
      System.out.println("Result minus is = " + 
                          objKalkulator.minus(value1, value2));
      System.out.println("Result multiplication is = " + 
                          objKalkulator.multiplication(value1, value2));
      System.out.println("Result division is = " + 
                          objKalkulator.division(value1, value2));
    }
    
}
