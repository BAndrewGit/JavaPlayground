package OOP.employee.example;


import java.util.ArrayList;
import java.util.List;

public class Employee {
    String FirstName;
    String LastName;
    int age;
    int salary;
    Role role;
    Location location;

    static class Location{
        String country;
        String region;
        String city;

        Location (String country, String region, String city){
            this.country = country;
            this.region = region;
            this.city = city;
        }
    }

    static List<Employee> allEmployees = new ArrayList<>();

    Employee(String FirstName, String LastName, int age, int salary, Role role, Location location){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.salary = salary;
        this.role = role;
        this.location = location;
        allEmployees.add(this);
    }

    void riseSalary(int amount){
        this.salary = this.salary + amount;
        System.out.println("Congrats, " + this.FirstName + " " + this.LastName + "! Your salary increased by " + amount + "RON. New salary is " + this.salary + " RON.");
    }

    static void listSalary(){
        for (Employee employee : allEmployees) {
            System.out.println(employee.FirstName + " " + employee.LastName + ": " + employee.salary + " RON");
        }
    }
}
