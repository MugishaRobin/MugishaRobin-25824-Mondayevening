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
public class ExceptionHandling {
    

    public static void main(String[] args) {
        try {
            // Attempt to read a non-existent file.
            FileReader reader = new FileReader("nonexistent.txt");
        } catch (IOException e) {
            // This block handles IOException if the file cannot be read.
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}


    

