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
public class Ejercicio_3_MayusculasMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        
        
        System.out.println("su nombre es " + frase.toUpperCase());
        
        
        System.out.println("su nombre es " + frase.toLowerCase());
    
}
}