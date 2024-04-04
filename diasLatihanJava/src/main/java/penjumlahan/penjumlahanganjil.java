/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjumlahan;

/**
 *
 * @author user
 */
public class penjumlahanganjil {
    public static void main(String[] args){
        System.out.println("Bilangan Ganjil antara 1-20=");
        System.out.println("-----");
        int i=1, ganjil=1,jumlah=0;
        
        while(i<=10){
            
            System.out.println(i+"."+ganjil);
            jumlah +=ganjil;
            ganjil=ganjil+2;
            i++;
        }
        System.out.println("-----");
        System.out.println("Jumlah =>"+jumlah);
        
        }
        
        
    }
    

