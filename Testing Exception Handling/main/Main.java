package main;

import java.util.Scanner;
import validation.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter department (CSE/ICT/ICE/ME/TE): ");
            String dept = sc.nextLine();

            AgeValidator.validate(age);
            DeptValidator.validate(dept);

            System.out.println("Input is valid!");
        } catch (InvalidAgeException | InvalidDeptException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error.Age must be a number: " + e.getMessage());
        }
    }
}