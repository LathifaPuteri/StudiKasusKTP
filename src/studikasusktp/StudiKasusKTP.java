/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusktp;

/**
 *
 * @author MOKLET-2
 */
public class StudiKasusKTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nonvoid ktp = new nonvoid();
        System.out.println(ktp.judul());
        System.out.println("========================================");
        ktp.biodata();
        System.out.println("========================================");
        System.out.println(ktp.akhiran());
        System.out.println("========================================");
        ktp.datadiri();
        System.out.println(ktp.berlaku());
        System.out.println("========================================");
    }
}
