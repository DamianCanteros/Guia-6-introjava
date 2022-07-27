/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_15 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese un número");
        int num1 = Leer.nextInt();
        
        System.out.println("ingrese otro número");
        int num2 = Leer.nextInt();
        
        System.out.println("¿qué operación le gustaria realizar?");
        System.out.println("1) sumar");
        System.out.println("2) restar");
        System.out.println("3) multiplicar");
        System.out.println("4) dividir");
        int menu = Leer.nextInt();
     
        switch(menu){
            
            case 1:
                System.out.println(Sumar(num1,num2));
            break;
            case 2:
                 System.out.println(Restar(num1,num2));
            break;
            case 3:
                 System.out.println(Multiplicar(num1,num2));
            break;
            case 4:
                 System.out.println(Dividir(num1,num2));
            break;
        }  
    }
    
    public static double Sumar(int num1,int num2){
        
        return num1+num2;
    }
    
    public static double Restar(int num1,int num2){
        
        return num1-num2;
    }
        
    public static double Multiplicar(int num1,int num2){
        
        return num1*num2;
    }

    public static double Dividir(int num1,int num2){
        
        return num1/num2;
    }    
}
