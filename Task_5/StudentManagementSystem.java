import java.io.*;
import java.util.*;

public class StudentManagementSystem 
{

    private List<Student> students;
    private final String FILE_NAME = "students.dat";

    public StudentManagementSystem() 
  {
        students = loadStudents();
    }

    public void addStudent(Student student) 
  {
        students.add(student);
        saveStudents();
        System.out.println("Student added successfully!");
    }

    public void removeStudent(String rollNumber) 
  {
        students.removeIf(student -> student.getRollNumber().equals(rollNumber));
        saveStudents();
        System.out.println("Student removed successfully!");
    }

    public Student searchStudent(String rollNumber) 
  {
        for (Student student : students) 
        {
            if (student.getRollNumber().equals(rollNumber)) 
            {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() 
  {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } 
        else 
        {
            for (Student student : students) 
            {
                System.out.println(student);
            }
        }
    }

    private void saveStudents() 
  {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(students);
        } 
          catch (IOException e) 
        {
            System.out.println("Error saving students.");
        }
    }

    private List<Student> loadStudents() 
  {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            return (List<Student>) ois.readObject();
        } catch (Exception e) 
        {
            return new ArrayList<>();
        }
    }
}
