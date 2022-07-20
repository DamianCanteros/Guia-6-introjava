/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_16_VectorN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random random = new Random();
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño del vector");
        int N = Leer.nextInt();
 
        System.out.println("ingrese el numero a buscar");
        int num = Leer.nextInt();
        
        int [] Vector;
        Vector = new int[N];
        int i;
        
        for (i=0 ; i<=N-1 ; i++){
            
            Vector[i] = random.nextInt(10);
            
            if (Vector[i]==num){
                
                System.out.println("el numero ingresado se encuentra en la pocisión " + (i+1));

            }   
        } 
            for (i=0 ; i<=N-1 ; i++){
            
                System.out.print("[");
                System.out.print(Vector[i]);
                System.out.print("]");
        } 
    }
}
