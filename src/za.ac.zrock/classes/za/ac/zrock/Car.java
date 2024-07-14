/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

/**
 *
 * @author Jeanette
 */
public class Car extends Vehicle{
    
     private int numOfDoors;

   public Car(String brand, String model, int year, int numOfDoors) {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numOfDoors);
    }
}



