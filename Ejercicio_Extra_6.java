/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_6 {

    public static void main(String[] args) {

        Scanner Leer= new Scanner(System.in);
        
        String respuesta;
        double TotalDebajo =0;
        double Total =0;
        int i=0;
        int j=0;
                
        do {
            System.out.println("ingrese la altura");
            double altura = Leer.nextDouble();
            
            if (altura<1.60){
                j += 1;
                TotalDebajo += altura;
            }
            
            i += 1;
            Total+= altura;
            
            System.out.println("quiere ingresar otra altura S/N");
            respuesta = Leer.next();
            
        } while (respuesta.equals("S"));
        
        MostrarPromedio(Total,i,TotalDebajo,j);
        
    }
    
    public static void MostrarPromedio(double Total, int i, double TotalDebajo, int j){
        
         System.out.println("el promedio de estaturas en general es de " +Total/i);
         System.out.println("el promedio de estaturas que se encuentran por debajo de 1.60 mts es de "+TotalDebajo/j);
    }
}
