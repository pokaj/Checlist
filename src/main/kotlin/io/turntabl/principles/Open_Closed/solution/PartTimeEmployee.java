package io.turntabl.principles.Open_Closed.solution;

public class PartTimeEmployee implements Employee{


    private double salary;

    public PartTimeEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateEmployeeBonus() {
        return this.salary * 0.2;
    }
}
