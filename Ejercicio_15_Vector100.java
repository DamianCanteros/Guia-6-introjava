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
public class Ejercicio_15_Vector100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        int[] Vector;
        Vector = new int[100];
        
        for(int i=0 ; i<=99 ; i++){
            Vector[i] = i+1;
        }
        for(int i=99 ; i>=0 ; i--){
            System.out.print("[");
            System.out.print(Vector[i]);
            System.out.print("]");
        }    
    }
    
}
