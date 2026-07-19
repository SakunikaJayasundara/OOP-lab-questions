/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author LENOVO
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    private Connection connection;

    public StudentDAO() {

        try {

            connection = StudentDatabaseConnection.getConnection();

        } catch (SQLException e) {

            System.out.println("Database Connection Error: " + e.getMessage());

        }

    }

    public void addStudent(Student student) {

        String sql =
                "INSERT INTO student(id,name,course) VALUES(?,?,?)";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getCourse());

            ps.executeUpdate();

            System.out.println("Student inserted successfully.");

        } catch (SQLException e) {

            System.out.println("Insert Error: " + e.getMessage());

        }

    }

    public void displayAllStudents() {

        String sql = "SELECT * FROM student";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        "ID : " + rs.getInt("id"));

                System.out.println(
                        "Name : " + rs.getString("name"));

                System.out.println(
                        "Course : " + rs.getString("course"));

                System.out.println("----------------------");

            }

        } catch (SQLException e) {

            System.out.println("Display Error: " + e.getMessage());

        }

    }

}