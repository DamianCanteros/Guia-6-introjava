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
public class Ejercicio_10_Limite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un número límite");
        int limite = leer.nextInt();
        
        int suma;
        suma=0;
        
        do {
        System.out.println("ingrese un número");
        int num = leer.nextInt();
        suma += num;
        }while (suma<=limite);
    }
    
}
