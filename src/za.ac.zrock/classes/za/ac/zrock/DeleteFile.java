/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

import java.io.File;

/**
 *
 * @author Jeanette
 */
public class DeleteFile {
    
    public boolean deleteFile(String filePath) {
        File file = new File(filePath);
        
        if (file.exists()) {
            return file.delete();
        } else {
            System.out.println("File does not exist.");
            return false;
        }
    }

}
