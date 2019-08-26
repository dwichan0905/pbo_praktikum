/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan;

import java.util.Scanner;

/**
 *
 * @author Dwi Candra Permana
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int uu;
        int yy = 0;
        System.out.println("Input Array");
        System.out.println("=============");
        
        for (int i = 0; i < x.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
        
        System.out.println("Tampilkan!");
        System.out.println("============");
        
        for (int i = 0; i < x.length; i++)
            System.out.println("Elemen ke-" + (i + 1) + ": " + x[i]);
        
        System.out.println("");
        
        // Pencarian Elemen Array
        System.out.print("Cari elemen array, masukkan nilainya: ");
        
        uu = sc.nextInt();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == uu) {
                System.out.println("Elemen tersebut berada pada indeks ke-" + i);
                break;
            } else if (x[i] != uu && i == x.length - 1) {
                System.out.println("Elemen tersebut tidak ditemukan.");
                break;
            }
        }
        
        // Menjumlahkan semua isi array
        System.out.print("Jumlah total isi elemen: ");
        for (int i = 0; i < x.length; i++) {
            yy += x[i];
        }
        System.out.println(yy);
    }
    
}
