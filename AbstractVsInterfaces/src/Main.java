public class Main {
    public static void main(String[] args) {

        Animal animal = new Michi("Gato con botas");
        System.out.println(animal.toString());
        animal.sonido();
        System.out.println("nombre: " + animal.name);
        animal.showMessage();
    }
}

