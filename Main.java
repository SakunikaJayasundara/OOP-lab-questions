/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();

        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

        Lecturer lec1 = new Lecturer("Nimal Perera", "L001", "IT", 2, 50000);
        Lecturer lec2 = new Lecturer("Kasuni Silva", "L002", "CS", 3, 45000);
        LabAssistant lab1 = new LabAssistant("Saman Kumara", "A001", "IT", 120, 500);

        // Change department
        lec1.changeDepartment("Software Engineering");

        System.out.println("\n--- Lecturer 1 ---");
        lec1.displayLecturerDetails();
        double pay1 = lec1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + pay1);

        System.out.println("\nLecturer 2");
        lec2.displayLecturerDetails();
        double pay2 = lec2.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + pay2);

        System.out.println("\nLab Assistant");
        lab1.displayLabAssistantDetails();
        double pay3 = lab1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + pay3);

        double total = pay1 + pay2 + pay3;
        System.out.println("\nTotal Payment: " + total);

        System.out.println("\nTotal Staff Count: " + StaffMember.getStaffCount());

        System.out.println("\nNotices");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab1.showCommonNotice();

        // Bonus
        System.out.println("\nBonus");
        System.out.println("Lecturer1 Bonus: " + UniversityPolicy.calculateBonus(pay1));
        System.out.println("Lecturer2 Bonus: " + UniversityPolicy.calculateBonus(pay2));
        System.out.println("Lab Assistant Bonus: " + UniversityPolicy.calculateBonus(pay3));
    }
}

/*
changeDepartment() is useful because it controls how updates happen instead of allowing direct access.
*/
