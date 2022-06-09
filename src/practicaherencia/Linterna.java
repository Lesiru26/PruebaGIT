/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author PACO
 */
public class Linterna {

    //atributos
    private boolean encendida;

    public Linterna() {
        this.encendida = false;
    }

    public void encender() {
        if (this.encendida == false) {
            this.encendida = true;
            System.out.println("<----");
        } else {
            System.out.println("¡Ya está encendida!");
            System.out.println("<----");
        }
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("<     ");
    }
}
