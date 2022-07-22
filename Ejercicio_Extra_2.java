/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package introjava;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_2 {

    public static void main(String[] args) {
       
        int A = 0;
        int B = 1;
        int C = 2;
        int D = 3;
        
        AsignacionDeValores(A,B,C,D);
                            
    }
    
    public static void AsignacionDeValores(int A, int B, int C, int D){
        
        int aux=B;
        B=C; 
        C=A;
        A=D;
        D=aux;
        
        System.out.print("A " +A +", B " +B +", C " +C +", D " +D);
        System.out.println();
    }

}
