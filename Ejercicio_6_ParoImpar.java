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
public class Ejercicio_6_ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un número");
        int num = leer.nextInt();
        
        if ( num % 2 == 0){
            System.out.println("el número es par");
        }else {
            System.out.println("el número es impar");
        }   
    }
    
}
