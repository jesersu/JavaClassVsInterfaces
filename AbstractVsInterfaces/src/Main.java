public class Main {
    public static void main(String[] args) {

        /**
         *         Animal animal = new Michi("Gato con botas");
         *         Se puede asignar Animal, pero no se podria llamar metodos o atributos que no esten
         *         en Animal, osea que animal parentMessage no se llamaria
         */

        Michi animal = new Michi("Gato con botas");

        //devuelve posicion en memoria del objeto
        System.out.println(animal.toString());

        //devuelve la implementacion del metodo en Michi
        animal.sonido();


        System.out.println("nombre: " + animal.name);

        //se llama a la implmentacion en Michi
        animal.showMessage();

        //Se llama a la implementacion de Animal
        animal.parentMessage();
    }
}

