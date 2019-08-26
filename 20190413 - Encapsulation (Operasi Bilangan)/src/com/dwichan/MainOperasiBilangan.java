/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan;

import java.util.Scanner;

/**
 *
 * @author chan386
 */
public class MainOperasiBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //double a, b;
        com.dwichan.OperasiBilangan obil = new com.dwichan.OperasiBilangan();
        
        System.out.print("a = ");
        obil.a = sc.nextDouble();
        
        System.out.print("b = ");
        obil.b = sc.nextDouble();
        
        System.out.println("Hasil " + obil.a + " + " + obil.b + " = " + obil.operasiTambah());
        System.out.println("Hasil " + obil.a + " - " + obil.b + " = " + obil.operasiKurang());
        System.out.println("Hasil " + obil.a + " * " + obil.b + " = " + obil.operasiKali());
        System.out.println("Hasil " + obil.a + " / " + obil.b + " = " + obil.operasiBagi());
        System.out.println("Hasil akar " + obil.a + " = " + obil.operasiAkar());
    }
    
}
