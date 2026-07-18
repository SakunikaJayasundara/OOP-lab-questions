/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author LENOVO
 */
public class StudentMarkReport {

    // Private array attribute
    private String[] marks;

    // Constructor
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to return the selected mark
    public int getMarkAt(int index) {

        String mark = marks[index];
        return Integer.parseInt(mark);

    }
}