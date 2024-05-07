package org.example;

public class Main {

    public static Employee employee;
    public static Company company;
    public static Util util = new Util();
    public static CompanyUtil companyUtil = new CompanyUtil();

    public static void main(String[] args) {
        System.out.println("creating Employee and Company");
        createEmployee();
        createCompany();
        System.out.println("updating Employee");
        updateEmployee();
    }

    private static void createEmployee() {
        employee = util.createEmployee("John", 30, 5000, "IT");
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.getDepartment());
    }

    private static void updateEmployee() {
        util.updateEmployee(employee, 31, 55000, "HR");
    }

    private static void createCompany() {
        company = companyUtil.createCompany("ABC", "IT", "India", "Bangalore");
    }
}