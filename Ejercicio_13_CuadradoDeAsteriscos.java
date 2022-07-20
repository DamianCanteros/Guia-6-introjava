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
public class Ejercicio_13_CuadradoDeAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int N = Leer.nextInt();
        
        for(int i=1 ; i<=N ; i++) {
            System.out.println("   ");
            
            for(int j=1 ; j<=N ; j++) {
                
                if (i==1 || i==N ){
                    System.out.print("* ");
                }else if (j==1 || j==N){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");    
                }       
            }
        }          
    }  
}
