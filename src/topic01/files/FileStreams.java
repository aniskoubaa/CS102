/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileStreams {
    public static void main(String []args) throws FileNotFoundException, IOException  {
       
        FileInputStream fileInputStream = null;
        File inputFile = new File("files/students.txt");
        FileOutputStream fileOutputStream = null;
        FileOutputStream encFileOutputStream = null;
        
        try{
            fileInputStream = new FileInputStream("files/students.txt");
            fileOutputStream = new FileOutputStream("files/students-copy.txt");
            encFileOutputStream = new FileOutputStream("files/students-encrypted.txt");

            int c=0;
            while((c=fileInputStream.read())!=-1){
                
                System.out.print((char)c);
                fileOutputStream.write(c);
                encFileOutputStream.write(c+2);
                
            }
            
            
        }catch (FileNotFoundException e){
            System.out.println("File not found exception!");
        }catch (IOException ex){
            System.out.println("IO Exception");
        }
        
        try {
            fileOutputStream.close();
        } catch (IOException ex) {
            System.out.println("IO Exception: Closing File");
        }
       
        System.out.println("");
        
       fileInputStream = new FileInputStream("files/students-encrypted.txt");
        int c=0;
            while((c=fileInputStream.read())!=-1){
                
                System.out.print((char)(c-2));

  
                
            }

    }
    
}
