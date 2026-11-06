package mx.com.animales;

public class Perro extends Animal implements Movible{

    public Perro (String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Wuf");
    }

    @Override
    public void moverse() {

    }
}
