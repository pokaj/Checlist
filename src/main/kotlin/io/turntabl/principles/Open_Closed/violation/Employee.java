package io.turntabl.principles.Open_Closed.violation;

public class Employee {

    public int Id;
    public String name;
    public double salary;

    public Employee(int Id, String name, double salary){
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateEmployeeBonus(){
        return this.salary * 0.2;
    }

    public static void main(String[] args) {
        Employee james = new Employee(211, "James", 8300);
        System.out.println(james.calculateEmployeeBonus());
    }

    /* Supposing we'd now like to calculate the bonus of the employee based on his
        status of employment (permanent or part-time, This would require us to alter the
        employee class (violation of the principle)
     */
}
