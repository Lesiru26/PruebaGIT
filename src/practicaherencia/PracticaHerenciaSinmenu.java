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
public class PracticaHerenciaSinmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Telefono telGen = new Telefono("marcaBlanca", 100, "rojo");
//        telGen.llamar();
//        Pijiphone piji2 = new Pijiphone("rojo");
//        Pijiphone piji3 = new Pijiphone("rojo");

        int numGit = 44;

        Pijiphone telef1 = new Pijiphone("rojo");
        Pijiphone piji2 = new Pijiphone(telef1);
        Pijiphone piji3 = new Pijiphone(telef1);

        System.out.println(piji2.getColor());
        System.out.println(piji3.getColor());
        
        telef1.llamar();
        piji2.llamar();
        piji3.llamar();

        Android telef2 = new Android("azul");
        Android and1 = new Android("azul");
        telef2.llamar();
        and1.llamar();

        System.out.println(Telefono.getContadorGlobal());
        System.out.println(Android.getAndContador());
        System.out.println(Pijiphone.getPijiContador());

    }

}
