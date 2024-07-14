/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jeanette
 */
public class FileHandler {
  public void readFile(String filePath) {
        BufferedReader bufferedReader = null;

        try {
          
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

          
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
          
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
           
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}