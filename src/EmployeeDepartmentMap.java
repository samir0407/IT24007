package src;
import java.util.*;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> empMap = new HashMap<>();
        empMap.put(201, "HR");
        empMap.put(202, "Finance");
        empMap.put(203, "IT");

        System.out.println("Employee Departments: " + empMap);
    }
}