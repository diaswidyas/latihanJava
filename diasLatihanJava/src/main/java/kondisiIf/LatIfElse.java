/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisiIf;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LatIfElse {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String keterangan ,nama;
    int nilai;
    
    System.out.print("Masukan Nama Siswa : ");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Akhir : ");
    nilai = input.nextInt();
        if(nilai > 70){
            //Perintah jika kondisi true
            keterangan="lulus";
        }else{
            //Perintah jika kondisi false
        keterangan="Gagal";
        }
        System.out.println("Hasil Akhir");
        System.out.println("============================================");
        System.out.println("Nama Siswa                  :"+nama);
        System.out.println("Nilai Akhir Yang di dapat   :"+nilai);
        System.out.println("Keterangan                  :"+keterangan);
        System.out.println("============================================");
    }
    
    }
    

