/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_5 {

    public static void main(String[] args) {
       
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese la clase de socio");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        String clase = Leer.next();
        
        System.out.println("ingrese el costo del tratamiento");
        int costo = Leer.nextInt();
        
        
        DeterminarImporte(clase,costo);
    }
    public static void DeterminarImporte(String clase, int costo){
        
        switch(clase){
            
            case "A":
                System.out.println("el importe a pagar en efectivo es $" + costo*0.5);    
            break;
            case "B":
                System.out.println("el importe a pagar en efectivo es $" + (costo-costo*0.35));
            break;
            case "C":
                System.out.println("el importe a pagar en efectivo es $" + costo);
            break;
        }
    }
}
