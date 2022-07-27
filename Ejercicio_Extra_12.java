/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package introjava;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_12 {

    public static void main(String[] args) {
        
        for (int k = 0; k < 10; k++) {
            
            for (int j = 0; j < 10; j++) {   
               
                for (int i = 0; i < 10; i++) {
                    
                    String letrai= ""+i;
                    String letraj= ""+j;
                    String letrak= ""+k;
                    
                    if (letrai.equals("3")) {
                        
                        System.out.println(k +"-" +j +"-E");  
                        
                    }else if (letraj.equals("3")) {
                        
                        System.out.println(k +"-E-" +i);
                        
                    }else if (letrak.equals("3")) {
                        
                        System.out.println("E-" +j +"-" +i);
                    }else{
                        System.out.println(k +"-" +j +"-" +i); 
                    } 
                }
            }    
        }
    } 
}
