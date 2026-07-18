/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author LENOVO
 */
public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR101", "Toyota", 5, 4000);
        Vehicle vehicle2 = new Bike("BIKE201", "Honda", 8, 500);

        System.out.println("Car Details");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println();

        System.out.println("Bike Details");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());
    }
}

/*
This is runtime polymorphism because the overridden
calculateRentalCost() method is selected according to the
actual object type (Car or Bike) at runtime.
*/
