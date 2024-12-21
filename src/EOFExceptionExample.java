/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.io.*;



public class EOFExceptionExample {
        public static void main(String[] args) {
        try {
            // Simulate reading beyond the file's content.
            DataInputStream dis = new DataInputStream(new FileInputStream("emptyFile.txt"));
            while (true) {
                dis.readInt(); // Throws EOFException when no more data is available.
            }
        } catch (EOFException e) {
            // This block handles unexpected end of file.
            System.out.println("EOFException: Reached the end of the file.");
        } catch (IOException e) {
            // Handles other I/O-related exceptions.
            System.out.println("IOException: " + e.getMessage());
        }
    }
}


    

