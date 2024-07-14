/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zrock;

import java.util.Scanner;
import za.ac.zrock.Car;
import za.ac.zrock.CurrentDirectory;
import za.ac.zrock.DeleteFile;
import za.ac.zrock.FileHandler;
import za.ac.zrock.Vehicle;
import za.ac.zrock.VowelCounter;

/**
 *
 * @author Jeanette
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("\nMenu:");
            System.out.println("1. Count vowels in a string");
            System.out.println("2. Display current working directory");
            System.out.println("3. Read a file using try-except-finally block");
            System.out.println("4. Delete a file");
            System.out.println("5. Create a subclass using inheritance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    int vowelCount = VowelCounter.countVowels(inputString);
                    System.out.println("Number of vowels: " + vowelCount);
                    break;
                case 2:

                    CurrentDirectory currentDir = new CurrentDirectory();
                    currentDir.currentDir();
                    break;
                case 3:

                    System.out.print("Enter file path to read: ");
                    String filePathToRead = scanner.nextLine();
                    FileHandler fileHandler = new FileHandler();
                    fileHandler.readFile(filePathToRead);
                    break;
                case 4:

                    System.out.print("Enter file path to delete: ");
                    String filePathToDelete = scanner.nextLine();
                    DeleteFile deleteFile = new DeleteFile();
                    boolean isDeleted = deleteFile.deleteFile(filePathToDelete);
                    if (isDeleted) {
                        System.out.println("File deleted successfully.");
                    }
                    break;
                case 5:

                    System.out.println("Creating a Vehicle object...");
                    System.out.print("Enter Vehicle brand: ");
                    String vehicleBrand = scanner.nextLine();
                    System.out.print("Enter Vehicle model: ");
                    String vehicleModel = scanner.nextLine();
                    System.out.print("Enter Vehicle year: ");
                    int vehicleYear = scanner.nextInt();
                    scanner.nextLine();

                    Vehicle vehicle = new Vehicle(vehicleBrand, vehicleModel, vehicleYear);
                    vehicle.displayInfo();

                    System.out.println("\nCreating a Car object (subclass of Vehicle)...");
                    System.out.print("Enter Car brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter Car model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Car year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("Enter number of doors: ");
                    int numOfDoors = scanner.nextInt();
                    scanner.nextLine();

                    Car car = new Car(carBrand, carModel, carYear, numOfDoors);
                    car.displayInfo();

                    System.out.println("\nThe Car class is a subclass of Vehicle, demonstrating inheritance.");
                    break;
                case 6:

                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }

        scanner.close();
    }
}
