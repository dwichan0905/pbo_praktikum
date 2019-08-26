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
public class ArrayDeklarasi {
    int[] js = {35, 38, 30, 33, 40};
    char kelas = 'A';
    
    public void tampil() {
        for (int i : js) // foreach di PHP
            System.out.println((kelas++) + "\t\t" + i);
    }
}
