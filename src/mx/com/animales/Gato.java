package mx.com.animales;

public class Gato extends Animal implements Movible{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Miau");
    }

    @Override
    public void moverse() {

    }
}
