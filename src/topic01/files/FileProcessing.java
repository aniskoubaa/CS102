/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileProcessing {
    
    public static void main(String []args)  {
    //file name
    String fileName = "output.txt";
    
    
    //create a file object
    File file = new File(fileName);
    
    //write to a file
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("CS102: We finished the lecture\n");
            fileWriter.close();
        }catch (Exception e){
            System.out.println("your message"+e);
        }
        
        //read from a file
        String inputfileName = "output.txt";
        File fileToRead = new File(inputfileName);
        try{
        
        Scanner scanner = new Scanner(fileToRead);
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
            
        }
        }catch(Exception e){
            System.out.println("I could not open to the file to read.");
        }
        
        
        
        
    
    
    }
  
    
    
    
    
}
