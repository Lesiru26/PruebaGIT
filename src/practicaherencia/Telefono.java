/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author PACO
 */
public class Telefono {

    //atributos
    private int PUK;
    private String marca;
    private String color;
    private int precio;
    private int contador1;
    private static int contadorGlobal;
    private Linterna linternaMovil = new Linterna();

    public Telefono(String marcaIn, int precioIn, String colorIn) {
        this.marca = marcaIn;
        this.precio = precioIn;
        this.color = colorIn;
        this.PUK = (int) ((Math.random() * 100000000));
    }

    public int getPUK() {
        return PUK;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public int getContador1() {
        return contador1;
    }

    public static int getContadorGlobal() {
        return contadorGlobal;
    }

    public String getColor() {
        return color;
    }

    public Linterna getLinternaMovil() {
        return linternaMovil;
    }

    public void llamar() {
        System.out.println("Marcando...");
        this.esperar(2);
        System.out.println("Comunicando");
        this.esperar(3);
        System.out.println("Blablabla");
        this.esperar(3);
        System.out.println("Pi-pi-pi...");
        this.contador1++;
        Telefono.contadorGlobal++;
        if (this.marca == "π-jiphone") {
            Pijiphone.subirPijiContador();
        } else if (this.marca == "&-roid") {
            Android.subirAndContador();
        } //si no, es otra marca

    }

    public void darLuz() {
        linternaMovil.encender();
    }

    public void quitarLuz() {
        linternaMovil.apagar();

    }

    public void esperar(int segundos) {

        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
