/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatScanner;

import java.io.*;

/**
 *
 * @author user
 */
public class LatBuffered {
    public static void main(String args[])throws Exception
    {
    //Membuat objec baru
    InputStreamReader Keyreader = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (Keyreader);
    //deklarasi variabel
    String kata1,Kata2;
    
    System.out.print("Masukan Kata Pertama : ");
    kata1 = input.readLine();
    System.out.print("Masukan Kata Kedua : ");
    Kata2 = input.readLine();
    System.out.println("\nHasil Input String " + kata1 + "" + Kata2);
    
    }
    
}
    
            
    
            
            
    

