/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02;

/**
 *
 * @author warik
 */
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("=========================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("=========================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah = "+hitungLuas());
    }
    
}
