/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orang;

/**
 *
 * @author Dwi Candra Permana
 */
public class orang {
    String nama;
    
    public void setNama(String i) {
        nama = i;
    }
    
    public String getNama() {
        return nama;
    }
    
    public static void main(String[] args) {
        orang ob = new orang();
        Orang1 waris = new Orang1();
        ob.setNama("Aliando");
        
        // Tidak ada di class Orang1, namun sifatnya diwariskan dari class orang
        waris.setNama("Liana");
        
        System.out.println("Halo, " + ob.getNama());
        System.out.println(waris.getHobi());
        System.out.println("Halo, " + waris.getNama());
    }
}
