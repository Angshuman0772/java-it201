// Interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes
// Create a class hostel containing hostelName, hostelLocation and numberofRooms.
//  The class contains methods for getting and printing the attributes.
// Then write Student class extending the Hostel class and implementing the Department interface.
// This class contains attributes studentName, regdNo, electiveSubject and avgMarks
// Write suitable getData and printData methods for this class.
// Also implement the abstract methods of the Department interface. Write a driver class to test the Student class. The program should be menu driven containing the options: 
// i) Admit new student 
// ii) Migrate a student 
// iii) Display details 
// For the second option a search is to be made on the basis of the entered registration number

import java.util.*;

interface Department {
    String deptName = "CSE", deptHead = "Dr. Sharma";

    void printDeptName();

    void printDeptHead();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberofRooms;

    void getHostel(Scanner sc) {
        System.out.print("Hostel name, location, rooms: ");
        hostelName = sc.next();
        hostelLocation = sc.next();
        numberofRooms = sc.nextInt();
    }

    void printHostel() {
        System.out.println("Hostel: " + hostelName + ", " +
                hostelLocation + ", Rooms: " + numberofRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Name, Regd No, Elective, Marks: ");
        studentName = sc.next();
        regdNo = sc.next();
        electiveSubject = sc.next();
        avgMarks = sc.nextDouble();
        getHostel(sc);
    }

    public void printDeptName() {
        System.out.println("Department: " + deptName);
    }

    public void printDeptHead() {
        System.out.println("Dept Head: " + deptHead);
    }

    void printData() {
        System.out.println("\nName: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Elective: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostel();
        printDeptName();
        printDeptHead();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Student> list = new ArrayList<>();

            while (true) {
                System.out.println("\n1.Admit Student");
                System.out.println("2.Migrate Student");
                System.out.println("3.Display Details");
                System.out.println("4.Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        Student s = new Student();
                        s.getData(sc);
                        list.add(s);
                        break;

                    case 2:
                        System.out.print("Enter Regd No: ");
                        String id = sc.next();
                        boolean found = false;

                        for (Student st : list) {
                            if (st.regdNo.equals(id)) {
                                System.out.println("Enter new hostel details:");
                                st.getHostel(sc);
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Student not found.");
                        break;

                    case 3:
                        for (Student st : list)
                            st.printData();
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}