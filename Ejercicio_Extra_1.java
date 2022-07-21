/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_1 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("ingrese la cantidad de minutos");
        int tiempo = Leer.nextInt();
                
        ConvertirMinutos(tiempo);        
    }
    
    public static void ConvertirMinutos(int tiempo){
        
        int dia= Math.abs(tiempo/60/24);
        int horas= (tiempo-(dia*60*24))/60;
                
        System.out.println("días " + dia + " horas " + horas);
          
    }
    
}
