/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisiIf;

/**
 *
 * @author user
 */
public class IfClass {
    public double TotBeli,potongan;
    
    public void setTotBeli(double a){
        TotBeli=a;
    }
    
    public double getPotongan(){
        if (TotBeli >= 500000){
           potongan =0.2 * TotBeli;
        }
        return potongan;
    }
public double JumlahBayar()
   {
     return (TotBeli=potongan);
    }
}

    

