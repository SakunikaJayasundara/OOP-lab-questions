/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;

/**
 *
 * @author LENOVO
 */
abstract class StaffMember {

    private String fullName;
    private final String staffId;
    protected String department;

    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++; // count objects
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public abstract double calculateMonthlyPayment();

    public static void showSystemName() {
        System.out.println("Campus Staff Payment System");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: Salary is processed at end of each month.");
    }
}

/*
StaffMember is abstract because it provides a general design and should not be instantiated directly.
*/