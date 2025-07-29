public class Michi extends Animal {

    //Sobrecarga de operadores (Overloading)
    Michi(String name ) {
        super(name);
    }

    Michi(){
        super("");
    }
    //
    @Override
    public void sonido() {

    }

// No es necesario el @Override pero si una buena practica
//    public void sonido() {
//        System.out.println("miau");
//    }

    protected void showMessage(){
        System.out.print("eat fish");
    }

    void parentMessage(){
        super.showMessage();
    }
}
