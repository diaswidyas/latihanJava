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
public class IfElseClass {
    public String nama,ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
    System.out.print("Masukan Nama Siswa:");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Akhir:");
    nilAkhir = input.nextInt();
    }
      public String getKeterangan(){
    if(nilAkhir > 70){
            // Perintah jika kondisi true
            ket="Lulus";
        }else{
            //perintah jika kondisi false
            ket="Gagal";
        }
    return ket;
 }
    
}
    
    

