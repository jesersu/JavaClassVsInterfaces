import SOLID.SingleResponsability.Employee;
import SOLID.SingleResponsability.ReportEmployee;

public class Main {
    public static void main(String[] args) {
        //TEST S in SOLID PRINCIPLES
        //Single Responsability
        Employee e = new Employee("lupita",10000);
        ReportEmployee re = new ReportEmployee();
        System.out.println(re.generateReport(e));

    }

    /**
     *         Animal animal = new Michi("Gato con botas");
     *         Se puede asignar Animal, pero no se podria llamar metodos o atributos que no esten
     *         en Animal, osea que animal parentMessage no se llamaria
     */
    public static void mainTestInterfacesAndAbstractClalses(String[] args) {

        Michi michi = new Michi("Gato con botas");

        //devuelve posicion en memoria del objeto
        System.out.println(michi);

        //devuelve la implementacion del metodo en Michi
        michi.sonido();


        System.out.println("nombre: " + michi.name);

        //se llama a la implmentacion en Michi
        michi.showMessage();

        //Se llama a la implementacion de Animal
        michi.parentMessage();

        //Interface
        michi.walk();
        michi.message();

    }
}

