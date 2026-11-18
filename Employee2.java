// Create a class named “Employee2” to store information of an employee (emp_no, name, department, basic_pay, DA, HRA and gross_salary). Write a program, which will take as input the  emp_no, name, department, basic_pay for several employees. The program will calculate the DA, HRA and total for each employee and display the details of the employee having the highest gross salary.

public class Employee2 {
    int emp_no;
    String name, department;
    double basic_pay, DA, HRA, gross_salary;

    Employee2(int emp_no, String name, String department, double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;

        DA = basic_pay * 0.50;
        HRA = basic_pay * 0.20;
        gross_salary = basic_pay + DA + HRA;
    }

    void display() {
        System.out.println("Employee No: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Employee2[] employees = {
                new Employee2(101, "Rahul", "CSE", 20000),
                new Employee2(102, "Amit", "IT", 30000),
                new Employee2(103, "Priya", "HR", 25000)
        };

        int max = 0;

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].gross_salary > employees[max].gross_salary) {
                max = i;
            }
        }

        System.out.println("Employee with Highest Gross Salary:");
        employees[max].display();
    }
}
