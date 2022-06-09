/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

/**
 * @version Buena
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

    /** 01
     * Entra la información al construirse:
     * @param marcaIn Marca del móvil
     * @param colorIn Color del móvil
     */
    public Telefono(String marcaIn, int precioIn, String colorIn) {
        this.marca = marcaIn;
        this.precio = precioIn;
        this.color = colorIn;
        this.PUK = (int) ((Math.random() * 100000000));
    }

    /** 02
     * Da el PUK
     * @return El dato es el puk
     */
    public int getPUK() {
        return PUK;
    }

    /** 03
     * Da la marca
     * @return marca del móvil
     */
    public String getMarca() {
        return marca;
    }

     /** 04
     * Da el precio
     * @return precio en euros
     */
    public int getPrecio() {
        return precio;
    }

     /** 05
     * Da el contador
     * @return contador de móviles vendidos
     */
    public int getContador1() {
        return contador1;
    }

    /** 06
     * da el contador total
     * @return contador total de todas las marcas
     */
    public static int getContadorGlobal() {
        return contadorGlobal;
    }

    /** 07
     * Obtiene el color
     */
    public String getColor() {
        return color;
    }

    /** 08
     * Da si la linterna está o no encendida
     * @return estado de linterna
     */
    public Linterna getLinternaMovil() {
        return linternaMovil;
    }

    /** 09
     * Simula sonido llamada
     */
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

    /** 10
     * Apaga la linterna
     */
    public void darLuz() {
        linternaMovil.encender();
    }

    /** 11
     * Enciende la linterna
     */
    public void quitarLuz() {
        linternaMovil.apagar();

    }

    /** 12
     * Realiza la espera en segundos
     */
    public void esperar(int segundos) {

        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
