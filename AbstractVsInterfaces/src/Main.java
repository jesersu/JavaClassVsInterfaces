import SOLID.DepdencyInversion.DataBase;
import SOLID.DepdencyInversion.MongoDB;
import SOLID.DepdencyInversion.MySQL;
import SOLID.DepdencyInversion.UserService;
import SOLID.Liskov.Cuadrado;
import SOLID.Liskov.Rectangulo;
import SOLID.OpenClose.CalculatorOfDiscount;
import SOLID.OpenClose.Discount;
import SOLID.OpenClose.RegularDiscount;
import SOLID.SingleResponsability.Employee;
import SOLID.SingleResponsability.ReportEmployee;

import javax.xml.crypto.Data;

public class Main {
    //Interface Segregation
    public static void main(String[] args) {
        //TEST S in SOLID PRINCIPLES
        //Single Responsability
        Employee e = new Employee("lupita",10000);
        ReportEmployee re = new ReportEmployee();
        System.out.println(re.generateReport(e));

        //OPEN CLOSE
        CalculatorOfDiscount calculator = new CalculatorOfDiscount();
        Discount discount = new RegularDiscount();
        calculator.applyDiscount(discount, 100);

        //Liskov sustitucion
        Rectangulo rc = new Rectangulo(2, 3);
        getAreaTest(rc);

        Rectangulo sq = new Cuadrado();
        sq.setAncho(5);
        getAreaTest(sq);

        //Dependency inversion
        MySQL mySQL = new MySQL();
        MongoDB mongoDB = new MongoDB();
        UserService userService = new UserService(mySQL);
        UserService userService2 = new UserService(mongoDB);

    }

    static void getAreaTest(Rectangulo r) {
        int ancho = r.getAncho();
        r.setAlto(10);
        System.out.println("Area esperada de " + (ancho * 10) + ", tiene " + r.getArea());
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

