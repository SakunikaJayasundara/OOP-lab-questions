/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author LENOVO
 */
public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge: "
                + calculator.calculateCharge(1000));

        System.out.println("Base + Distance: "
                + calculator.calculateCharge(1000, 10));

        System.out.println("Base + Distance + Weight: "
                + calculator.calculateCharge(1000, 10, 5));

        System.out.println("Express Delivery: "
                + calculator.calculateCharge(1000, true));
    }
}

/*
This is compile-time polymorphism because Java selects
the correct overloaded method based on the parameter list
during compilation.
*/
