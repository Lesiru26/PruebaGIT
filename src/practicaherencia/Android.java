/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PACO
 */
public class Android extends Telefono {

    private static int andContador;

    public Android(String colorIn) {
        super("&-roid", 200, colorIn);
    }

    //atributos
    public void dibujar() {
        System.out.println("Se abre el paint para que puedas dibujar :)");
        ProcessBuilder proceso = new ProcessBuilder("mspaint.exe");
        try {
            proceso.start();
        } catch (IOException ex) {
            Logger.getLogger(Android.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void subirAndContador(){
        Android.andContador++;
    }

    public static int getAndContador() {
        return andContador;
    }

}
