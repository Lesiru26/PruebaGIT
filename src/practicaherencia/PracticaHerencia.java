/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

import java.util.Scanner;

/**
 *
 * @author PACO
 */
public class PracticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color;
        System.out.println("Hola, bienvenidos a la tienda Pepito. ");
        System.out.println("¿De qué color quieres el móvil?");
        color = sc.next();
        System.out.println("¿Qué marca quieres?\n1) π-jiphone\n2) &-roid\nOtro) Salir");
        switch(sc.nextInt()){
            case 1:
                Pijiphone telefono1 = new Pijiphone(color);
                System.out.println("¿Qué deseas hacer?");
                //rellenar menú en cada caso
                break;
            case 2: 
                  Android telefono2 = new Android(color);
                  System.out.println("¿Qué deseas hacer?");
                  break;
                   //rellenar menú en cada caso
            default:
                System.out.println("Adiós");
        }
        
        
        
    }
    
}
