package io.turntabl.principles.Open_Closed.solution;

public class PermanentEmployee implements Employee {

    private double salary;

    public PermanentEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateEmployeeBonus() {
        return this.salary * 0.4;
    }
}
