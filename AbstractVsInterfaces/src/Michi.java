public class Michi extends Animal implements Walk {

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

    @Override
    public void message() {
        System.out.println("im near to run");
    }

    //tambien se puede hacer override de los default de interfaces
    @Override
    public void walk(){

    }
}
