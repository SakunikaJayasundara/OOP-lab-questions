/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06;

/**
 *
 * @author LENOVO
 */

public class Member {

    private String memberName;
    private String membershipType;
    private boolean newsletter;
    private int numberOfMonths;

    public Member(String memberName, String membershipType,
                  boolean newsletter, int numberOfMonths) {

        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletter = newsletter;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public double getMembershipFee() {

        double monthlyFee;

        if (membershipType.equals("Premium")) {
            monthlyFee = 3000;
        } else {
            monthlyFee = 1500;
        }

        double total = monthlyFee * numberOfMonths;

        if (newsletter) {
            total += 200;
        }

        return total;
    }

    public String getNewsletterText() {

        if (newsletter) {
            return "Subscribed";
        } else {
            return "Not Subscribed";
        }

    }

}
