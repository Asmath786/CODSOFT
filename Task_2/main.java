import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] totals = new int[n];
        double[] averages = new double[n];
        String[] grades = new String[n];
        String[] results = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Tamil Marks: ");
            int tamil = sc.nextInt();

            System.out.print("English Marks: ");
            int english = sc.nextInt();

            System.out.print("Maths Marks: ");
            int maths = sc.nextInt();

            System.out.print("Science Marks: ");
            int science = sc.nextInt();

            System.out.print("Social Science Marks: ");
            int social = sc.nextInt();
            sc.nextLine();

            totals[i] = tamil + english + maths + science + social;
            averages[i] = totals[i] / 5.0;

            if (averages[i] >= 90)
                grades[i] = "A+";
            else if (averages[i] >= 80)
                grades[i] = "A";
            else if (averages[i] >= 70)
                grades[i] = "B";
            else if (averages[i] >= 60)
                grades[i] = "C";
            else if (averages[i] >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";


            if (averages[i] >= 50)
                results[i] = "PASS";
            else
                results[i] = "FAIL";
        }

    
        System.out.println("\n========== RESULT ==========");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent Name: " + names[i]);
            System.out.println("Total Marks: " + totals[i] + "/500");
            System.out.println("Average: " + averages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("Result: " + results[i]);
        }

        sc.close();
    }
}
