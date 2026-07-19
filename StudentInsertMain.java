/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author LENOVO
 */
public class StudentInsertMain {

    public static void main(String[] args) {

        Student student =
                new Student(
                        1,
                        "Kamal",
                        "OOP"
                );

        StudentDAO dao = new StudentDAO();

        dao.addStudent(student);

    }

}