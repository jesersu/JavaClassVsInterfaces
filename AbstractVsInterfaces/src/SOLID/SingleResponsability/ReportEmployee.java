package SOLID.SingleResponsability;

public class ReportEmployee {

    public String generateReport(Employee employee){
        return "Employee: " + employee.getName() + ", Salary: " + employee.getSalary();
    }
}
