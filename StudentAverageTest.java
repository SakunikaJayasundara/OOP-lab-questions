/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author LENOVO
 */
public class StudentAverageTest {

    public static void main(String[] args) {

        // Create object with numberOfStudents = 0
        StudentAverageCalculator calculator =
                new StudentAverageCalculator(500, 0);

        try {

            int average = calculator.calculateAverage();
            System.out.println("Average = " + average);

        }
        // Exception occurs because division by zero is not allowed.
        catch (ArithmeticException e) {

            System.out.println("Error: Number of students cannot be zero.");

        }
        finally {

            System.out.println("Average calculation completed.");

        }

        System.out.println("Program continues...");
    }
}
