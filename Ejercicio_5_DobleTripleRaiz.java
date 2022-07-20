/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_5_DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un número");
        int num = leer.nextInt();
          
        System.out.println("el doble es " + num*2);
        System.out.println("el triple es " + num*3);
        System.out.println("la raiz cuadrada es " + Math.sqrt(num));
        
        
    }
    
}
