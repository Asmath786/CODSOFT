import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
  {

        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        int choice;

        do 
        {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) 
            {
                System.out.println("Invalid input. Enter a number.");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine().trim();

                    System.out.print("Enter Roll Number: ");
                    String roll = scanner.nextLine().trim();

                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine().trim();

                    if (name.isEmpty() || roll.isEmpty() || grade.isEmpty()) 
                    {
                        System.out.println("All fields are required!");
                    } 
                    else 
                    {
                        sms.addStudent(new Student(name, roll, grade));
                    }
                    break;

                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    String removeRoll = scanner.nextLine();
                    sms.removeStudent(removeRoll);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    String searchRoll = scanner.nextLine();
                    Student found = sms.searchStudent(searchRoll);

                    if (found != null) 
                    {
                        System.out.println("Student Found:");
                        System.out.println(found);
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } 
        while (choice != 5);
          
    scanner.close();
    }
}
