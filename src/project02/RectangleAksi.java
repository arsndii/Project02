/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02;

/**
 *
 * @author warik
 */
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 9;
        r1.lebar = 3;
        
        r1.cetakInfo();
        System.out.println("Luas Rectangle = "+r1.hitungLuas());
        r1.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakInfo();
        
        Rectangle r3 = new Rectangle(50,30);
        r3.cetakInfo();
    }
}
