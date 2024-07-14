/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

import java.util.Scanner;

/**
 *
 * @author Jeanette
 */
public class VowelCounter {
    
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

}
