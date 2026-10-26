// Create a class called Employee. Employee has three private data members name,
// department and salary. Initialize these data member via constructor. Display
// all the information for 5 employee of same company. Also display name of
// their company. Use static member concept to implement this code.
class Employee {
    private String name;
    private String department;
    private double salary;
    private static String companyName = "Google";

    // Constructor to initialize data members
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Company: " + companyName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", "HR", 60000);
        Employee emp2 = new Employee("Bob Smith", "IT", 75000);
        Employee emp3 = new Employee("Charlie Brown", "Finance", 70000);
        Employee emp4 = new Employee("Diana Prince", "Marketing", 65000);
        Employee emp5 = new Employee("Ethan Hunt", "Operations", 72000);

        // Display information for each employee
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
        emp5.displayInfo();
    }
}