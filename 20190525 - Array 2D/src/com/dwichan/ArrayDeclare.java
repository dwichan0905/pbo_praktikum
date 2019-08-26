/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan;

/**
 *
 * @author Dwi Candra Permana
 */
public class ArrayDeclare {
    String[][] pasutri = {{"Wahyu", "Lia"}, {"Bambang", "Lina"}, {"Hamdani", "Tia"}};
    
    public void tampilPasutri() {
        int i = 1;
        for(String[] pasutri1: pasutri) // foreach($pasutri as $pasutri1)
            System.out.println((i++) + "\t\t" + pasutri1[0] + "\t\t" + pasutri1[1]);
    }
}
