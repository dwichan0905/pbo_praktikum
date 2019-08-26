/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1;

import java.util.Scanner;

/**
 *
 * @author Dwi Candra Permana
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Contoh Output
        System.out.print("Hello World!");
        
        // Contoh Output (ditambah baris baru)
        System.out.println("Hello World!");
        
        // Membuat scanner baru, untuk menangkap input data yg diinputkan user
        Scanner sc = new Scanner(System.in);
        
        // Kenalan yuk :)
        System.out.print("Namamu? ");
        String nama = sc.nextLine(); // Menangkap string dari user
        System.out.print("NIM kamu? ");
        String nim = sc.nextLine();
        System.out.print("Kelas? ");
        String kelas = sc.nextLine();
        
        System.out.println("Nama kamu " + nama + "\nNIM kamu " + nim + "\nKamu berada di kelas " + kelas.toUpperCase()); // .toUpperCase() untuk mengubah semua huruf menjadi kapital
        
        // Belajar ngitung yuk kwkwkwkw
        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt(); // menangkap integer dari user
        System.out.print("Masukkan nilai b: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Hasil: " + a + " + " + b + " = " + c);
    }
    
}
