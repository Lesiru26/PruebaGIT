/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author PACO
 */
public class Pijiphone extends Telefono {

    //atributos
    private String ubicacion;
    private GPS gpsPiji = new GPS();
    private static int pijiContador;

    public Pijiphone(String colorIn) {
        super("π-jiphone", 700, colorIn);
    }
    
    public Pijiphone(Pijiphone movilInicial){
        super(movilInicial.getMarca(), movilInicial.getPrecio(), movilInicial.getColor());
        this.ubicacion = movilInicial.getUbicacion();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void actualizarGPS() {
        this.ubicacion = gpsPiji.darUbicacion();
    }

//    public void llamar_especial() {
//        System.out.println("Esta conversación va a ser grabada");
//        super.llamar();
//        System.out.println("Fin de la grabación, está disponible en la carpeta Audio");
//    }
//    
    @Override
        public void llamar() {
        System.out.println("Esta conversación va a ser grabada");
        super.llamar();
        System.out.println("Fin de la grabación, está disponible en la carpeta Audio");
    }

    public static int getPijiContador() {
        return pijiContador;
    }
    
    public static void subirPijiContador() {
        Pijiphone.pijiContador++;
    }
}
