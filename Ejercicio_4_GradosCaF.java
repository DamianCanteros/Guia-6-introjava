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
public class Ejercicio_4_GradosCaF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
                
        System.out.println("ingrese la temperatura en °C");
        int grados = leer.nextInt();
        
        System.out.println("la temperatura es de " + (32+(9*grados/5)) + "°F");
                
    }
    
}
