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
public class Ejercicio_8_OchoDeLargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        
        if ( frase.length() == 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}