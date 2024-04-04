/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatScanner;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AksiScanner {
    /**
     *  @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek baru
        ClassScanner Scan = new ClassScanner();
        
        Scan.inputScanner();
        System.out.println("\nNama Anda :" + Scan.getnama());
        System.out.println("Nilai Anda : " + Scan.rata());
        
    }
}
    
        
    

