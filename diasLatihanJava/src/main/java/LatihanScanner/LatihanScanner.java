/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanScanner;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class LatihanScanner {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.MEMBUAT SCANNER
        Scanner input = new Scanner(System.in);
        
        //2. MENERIMA INPUTAN DARI SCANNER
        System.out.print("Masukan NIM = ");
        String nim = "";
        nim = input.nextLine();
        
        System.out.print("Masukasn Nama = ");
        String nama = "";
        nama = input.nextLine();
        
        System.out.print("Masukan Nilai ip = ");
        double ip1;
        ip1 = input.nextDouble();
        
        //3. MENAMPILKAN OUTPUT
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("ip semester 1 = " + ip1);
        
    }
    
}
