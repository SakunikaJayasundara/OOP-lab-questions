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
import java.sql.SQLException;

public class StudentConnectionTest {

    public static void main(String[] args) {

        try {

            Connection con =
                    StudentDatabaseConnection.getConnection();

            if (con != null) {

                System.out.println(
                        "Database Connected Successfully!"
                );

                con.close();

            }

        } catch (SQLException e) {

            System.out.println(
                    "Database Error: " + e.getMessage()
            );

        }

    }

}