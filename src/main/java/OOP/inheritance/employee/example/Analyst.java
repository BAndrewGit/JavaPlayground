package OOP.inheritance.employee.example;

public class Analyst extends Employee {
    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getBonus() {
        return super.salary * .05;
    }

}
