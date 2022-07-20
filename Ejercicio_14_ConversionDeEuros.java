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
public class Ejercicio_14_ConversionDeEuros {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("ingrese la cantidad de Euros");
        int Euros = Leer.nextInt();
        
        System.out.println("¿A que moneda quiere convertir?");
        System.out.println("libras");
        System.out.println("dólares");
        System.out.println("yenes");
        String Moneda = Leer.next();
        
        ConversorDeEuros(Euros,Moneda);
    }
    
     public static void ConversorDeEuros(int Euros ,String Moneda){
         
        switch (Moneda){
            
            case "libras": 
                        System.out.println(Euros * 0.86); 
                        break;
            case "dólares": 
                        System.out.println(Euros * 1.28611); 
                        break;
            case "yenes" : 
                        System.out.println(Euros * 129.852); 
                        break;
            default:
        }   
        }
}

