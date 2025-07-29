public class Michi extends Animal {

    Michi(String name) {
        super(name);
    }

    public void sonido() {
        System.out.println("miau");
    }

    protected void showMessage(){
        System.out.print("eat fish");
    }
}
