/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package induk;

/**
 *
 * @author Dwi Candra Permana
 */
public class Induk {
    double panjang, lebar;
    
    public double LuasAlas() {
        double p = 20, l = 10;
        
        this.panjang = p;
        this.lebar = l;
        
        return panjang * lebar;
    }
    
    public static void main(String[] args) {
        Induk init = new Induk();
        Anak waris = new Anak();
        
        init.LuasAlas();
        
        // Tidak ada di class Anak, namun sifatnya telah diwariskan dari class Induk
        waris.LuasAlas();
        
        System.out.println("Panjang = " + waris.panjang);
        System.out.println("Lebar = " + init.lebar);
        System.out.println("Luas Alas = " + init.LuasAlas());
        System.out.println("Volume = " + waris.Volume());
    }
}
