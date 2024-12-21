/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
//java
//Copy code
import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to open a missing file.
            FileInputStream file = new FileInputStream("missingFile.txt");
        } catch (FileNotFoundException e) {
            // This block handles FileNotFoundException specifically.
            System.out.println("FileNotFoundException: File not found.");
        }
    }
}


    

