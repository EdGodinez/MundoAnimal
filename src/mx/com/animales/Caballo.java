package mx.com.animales;

public class Caballo extends Animal implements Movible {

    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.print("Sonido: Hiiii | ");
    }

    @Override
    public void moverse() {
        System.out.print("Movimiento: Galopa");
    }
}
