/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;

/**
 *
 * @author LENOVO
 */
final class UniversityPolicy {

    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader() {
        System.out.println("University Payment Policy");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}

/*
A final class cannot be inherited to prevent modification of important rules.
*/

