/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungaritmetika;

import java.util.Scanner;

/**
 *
 * @author chan386
 */
public class HitungAritmetika {

    double p, l, d;
    
    public void diag() {
        d = Math.sqrt(Math.pow(p, 2) + Math.pow(l, 2));
        System.out.println("d = " + d);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HitungAritmetika ha = new HitungAritmetika();
        // double p, l;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("P = ");
        ha.p = sc.nextDouble();
        
        System.out.print("L = ");
        ha.l = sc.nextDouble();
        
        ha.diag();
    }
    
}
