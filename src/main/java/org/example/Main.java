package org.example;

public class Main {

    public static Employee employee;

    public static void main(String[] args) {
        System.out.println("creating Employee and Company");
        createEmployee();
        System.out.println("updating Employee");
    }

    private static void createEmployee() {
        employee = new Employee("John", 30, 50000, "IT");
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.getDepartment());
    }

}