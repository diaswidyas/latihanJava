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
public class IfElseMajemuk {
    public static void main(String[] args){
    int pendapatan;
    double jasa, komisi, total;
//deklarasi objek
Scanner input = new Scanner(System.in);
System.out.print("Masukan Pendapatan Sales Rp. ");
pendapatan = input.nextInt();

if (pendapatan >= 0 && pendapatan <= 200000){    
jasa=10000;
komisi=0.1*pendapatan;
}
else if(pendapatan<=500000){
jasa=20000;
komisi=0.15*pendapatan;
}
else {
jasa=30000;
komisi=0.2*pendapatan;
}
/*menghitung total*/
total = komisi+jasa;
System.out.println("\nUaang JasaRp. "+ (int) jasa);
System.out.println("Uang komisi Rp. "+ (int) komisi); 
System.out.println("================================");
System.out.println("Uang Total Rp. "+ (int) total );        
}
}    



