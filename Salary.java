// Write a program to implement the Multiple Inheritance kind of framework (Gross Interface, Employee3 & Salary classes).

interface Gross {
    void calculateGross();
}

class Salary implements Gross {
    double basicPay, DA, HRA, grossSalary;

    Salary(double basicPay) {
        this.basicPay = basicPay;
    }

    public void calculateGross() {
        DA = basicPay * 0.10; // 10% DA
        HRA = basicPay * 0.20; // 20% HRA
        grossSalary = basicPay + DA + HRA;
    }
}

class Employee3 extends Salary {
    int empNo;
    String name, department;

    Employee3(int empNo, String name, String department, double basicPay) {
        super(basicPay);
        this.empNo = empNo;
        this.name = name;
        this.department = department;
    }

    void display() {
        calculateGross();

        System.out.println("Employee Number: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        Employee3 e = new Employee3(101, "Angshuman", "CSE", 30000);
        e.display();
    }
}
