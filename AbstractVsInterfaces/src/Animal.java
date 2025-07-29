public abstract class Animal {

    String name ;

    Animal (String name){
        this.name = name;
    }
    public abstract void sonido();

    protected void showMessage(){
        System.out.println("comen");

    }

}
