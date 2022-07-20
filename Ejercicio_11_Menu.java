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
public class Ejercicio_11_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro número");
        int num2 = leer.nextInt();
        
        String opcion = "N";
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            int menu = leer.nextInt();
                
            switch (menu){
                case 1:
                        System.out.println(num1 + num2);
                        continue;
                case 2:
                        System.out.println(num1 - num2);
                        continue;
                case 3:
                        System.out.println(num1 * num2);
                        continue;
                case 4:
                        System.out.println(num1 / num2);
                        continue;
                case 5:
                        System.out.println("esta seguro que desea salir del programa (S/N)");
                        opcion = leer.next();
                        break;                    
            }
        } while (opcion.equals("N"));
    }   
}
