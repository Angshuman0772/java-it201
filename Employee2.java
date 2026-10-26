// Create a class named “Employee” to store information of an employee (emp_no, name, department, basic_pay, DA, HRA and gross_salary). Write a program, which will take as input the  emp_no, name, department, basic_pay for several employees. The program will calculate the DA, HRA and total for each employee and display the details of the employee having the highest gross salary.

public class Employee2 {
    private int emp_no;
    private String name;
    private String department;
    private double basic_pay;
    private double DA;
    private double HRA;
    private double gross_salary;

    // Constructor to initialize data members
    public Employee2(int emp_no, String name, String department, double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;

        DA = 0.1 * basic_pay; // 10% of basic pay
        HRA = 0.2 * basic_pay; // 20% of basic pay
        gross_salary = basic_pay + DA + HRA;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Pay: $" + basic_pay);
        System.out.println("DA: $" + DA);
        System.out.println("HRA: $" + HRA);
        System.out.println("Gross Salary: $" + gross_salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1, "John Doe", "Tech", 60000);
        Employee2 e2 = new Employee2(2, "Jane Doe", "HR", 40000);
        Employee2 e3 = new Employee2(3, "Nathan Frost", "Management", 70000);
        Employee2 e4 = new Employee2(4, "Alex Warren", "Accounting", 45000);
        Employee2 e5 = new Employee2(5, "Patrick Hart", "Tech", 55000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
        e4.displayInfo();
        e5.displayInfo();

    }

}
