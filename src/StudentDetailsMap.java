package src;
import java.util.*;

class Student {
    String name;
    String department;

    Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name + " (" + department + ")";
    }
}

public class StudentDetailsMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> studentMap = new TreeMap<>();
        studentMap.put(101, new Student("Samir", "ICT"));
        studentMap.put(102, new Student("Rahim", "CSE"));

        System.out.println("Student Details: " + studentMap);
    }
}