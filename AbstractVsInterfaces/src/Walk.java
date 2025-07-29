public interface Walk {
    //default: disponible apartir de java 8: sirve parada
    //darle funcionalidad al metodo
    //esto se llama metodo concreto, x q tiene implementacion
    default void walk(){
        System.out.print("animal caminando");
    }

    //pueden ir n metodos abstractos
    void message();

}
