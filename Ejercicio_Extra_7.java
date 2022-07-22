/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_7 {

    public static void main(String[] args) {
       
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("¿Cuantos números desea ingresar?");
        int n = Leer.nextInt();
        
        CalvularConDoWhile(n);       
    }
    
    public static void CalvularConWhile(int n) {
        
        Scanner Leer = new Scanner(System.in);
        int i =0;
        int Max =0;
        int Min =999;
        int Total = 0;
                
        while (i !=  n) {
            i += 1;
            System.out.println("ingrese un número");
            int num = Leer.nextInt();   
            
            Max = Math.max(Max,num);
            Min = Math.min(Min,num);
            Total += num;

        }
        System.out.println("el valor máximo es " +Max);
        System.out.println("el valor mínimo es " +Min);
        System.out.println("el promedio es " +Total/n);
    }
    
        public static void CalvularConDoWhile(int n) {

        Scanner Leer = new Scanner(System.in);
        int i =0;
        int Max =0;
        int Min =999;
        int Total = 0;
                
        do {
            i += 1;
            System.out.println("ingrese un número");
            int num = Leer.nextInt();   
            
            Max = Math.max(Max,num);
            Min = Math.min(Min,num);
            Total += num;

        }while (i !=  n);
        System.out.println("el valor máximo es " +Max);
        System.out.println("el valor mínimo es " +Min);
        System.out.println("el promedio es " +Total/n);
    }
    
}
