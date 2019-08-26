/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author chan386
 */
public class FirstConstructors {
    
    public FirstConstructors(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Hasil 1 = " + (a + b));
        System.out.println("Hasil 2 = " + (a * b));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstConstructors cs1 = new FirstConstructors(10, 50);
        SecondConstructors cs2 = new SecondConstructors(15, 30);
    }
    
}
