/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjumlahan;

/**
 *
 * @author user
 */
public class penjumlahangenap {
    public static void main(String[] args){
        System.out.print("Bilangan Genap antara 1-20+");
        System.out.print("-----");
        int i=1,genap=2,jumlah=0;
        
        while(i<=10){
            
            System.out.println(1+". "+genap);
            jumlah += genap;
            genap = genap+2;
            i++;
        }
        System.out.println("-----");
        System.out.println("Jumlah => "+jumlah);
        
            
        }
    }
    

