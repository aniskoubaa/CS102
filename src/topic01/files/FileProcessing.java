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


public class FileProcessing {
   public static void main(String [] args) throws FileNotFoundException, IOException {
       
       String inputFileName = "files/student.txt";
       String outputFileName = "files/output.txt";
       
       //create a file object
       File inputFile = new File(inputFileName);
       File outputFile = new File(outputFileName);
        
       //create a scanner object that opens up the file
       Scanner input = new Scanner(inputFile);
        
       //create a FileWriter object to write into the file
       FileWriter fw = new FileWriter (outputFile, false);
 
       
       int count=0;
       //process the file
       while (input.hasNext()){
          String line = input.nextLine(); 
          count++;
          String [] lineArray = line.split(":");
          for (String s : lineArray){
           System.out.print(s+" ");
       }
       System.out.println();
       }  
        fw.write("the number of students is " + count+"\n");  
        fw.close();
        input.close();
   }
}