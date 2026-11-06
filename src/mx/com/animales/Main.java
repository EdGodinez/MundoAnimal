package mx.com.animales;

public class Main {
    static void main(String[] args) {

        Perro perro = new Perro("Odin", 5);
        Gato gato = new Gato("Pelusa", 4);
        Vaca vaca = new Vaca("Pinta", 6);
        Caballo caballo = new Caballo("Trueno", 10);


        Animal[] listaAnimales = {perro, gato, vaca, caballo};

        for (Animal animal : listaAnimales){
            animal.mostrarInformacion();
            animal.hacerSonido();

            Movible movimiento = (Movible) animal;
            movimiento.moverse();

            System.out.println();
        }

    }
}
