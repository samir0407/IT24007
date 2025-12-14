/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtest3factorion;

/**
 *
 * @author samir
 */
public class FactorionFinder {
    


       public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public boolean isFactorion(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    
    public void findFactorions(int start, int end) {
        System.out.println("Factorion numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
            }
        }
    }
}