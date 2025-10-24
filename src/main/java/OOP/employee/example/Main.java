package OOP.employee.example;

public class Main {
    public static void main(String[] args){
        Employee AmandaHR = new Employee("Amanda", "Robins", 19, 4000, Role.HR, new Employee.Location("Romania", "Olt", "Slatina"));
        Employee JohnFisherMan = new Employee("John", "Peacock", 27, 7500, Role.MANAGER, new Employee.Location("Romania", "Cluj", "Cluj-Napoca"));

        Employee.listSalary();

        JohnFisherMan.riseSalary(500);

        Employee.listSalary();
    }
}
