/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author LENOVO
 */
public class StudentAverageCalculator {

    // Private attributes
    private int totalMarks;
    private int numberOfStudents;

    // Constructor
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to calculate average
    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}
