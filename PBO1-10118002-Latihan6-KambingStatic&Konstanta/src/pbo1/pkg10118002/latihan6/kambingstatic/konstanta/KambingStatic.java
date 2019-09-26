/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118002.latihan6.kambingstatic.konstanta;

/**
 *
 * @author ASUS
 * Nama     : Rizky Muslimin
 * Kelas    : IF1
 * NIM      : 10118002
 */

public class KambingStatic {
    //NAMA_KAMBING sebgai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
