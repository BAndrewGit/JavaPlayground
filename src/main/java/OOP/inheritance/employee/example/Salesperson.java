package OOP.inheritance.employee.example;

public class Salesperson extends Employee {
    private double commissionRate;

    public Salesperson(String name, double salary, int age, double commissionRate) {
        super(name, salary, age);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void raiseCommissionRate() {
        if (this.commissionRate < .30) {
            this.commissionRate += 0.05;
        }
    }
}
