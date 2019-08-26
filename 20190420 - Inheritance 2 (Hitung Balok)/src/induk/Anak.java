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
public class Anak extends Induk {
    double tebal;
    Induk waris = new Induk();
    double volume;
    
    public double Volume() {
        double tb = 3;
        this.tebal = tb;
        
        return waris.LuasAlas() * tebal;
    }
}
