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
public class ArrayBubbleSort {
    private void urutkan(int larik[]) {
        for (int i = 0; i < larik.length; i++) {
            for (int j = 1; j <= (larik.length - 1); j++) {
                if (larik[j - 1] > larik[j]) {
                    tukar(larik, j - 1, j);
                }
            }
        }
    }
    
    private void tukar(int[] larik, int kiri, int kanan) {
        int tamp;
        tamp = larik[kiri];
        larik[kiri] = larik[kanan];
        larik[kanan] = tamp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayBubbleSort abs = new ArrayBubbleSort();
        int x[] = new int[5];
        System.out.println("Entri elemen array");
        System.out.println("====================");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
        System.out.println("");
        
        System.out.println("Sebelum diurut");
        System.out.println("====================");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        
        System.out.println("\n\nSetelah diurut");
        System.out.println("====================");
        for (int i = 0; i < x.length; i++) {
            abs.urutkan(x);
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
    
}
