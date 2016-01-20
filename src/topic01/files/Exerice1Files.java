/*
 * Write a Java Program, that opens the file "files/students.txt"
 * The program must read the file line by line
 * The program parses each line that it reads
 * For example, for this line: 
 * 1:mohamed:ali:0504123456:cs102:cs202
 * The program must print
 *    >ID = 1
 *    >First Name = Mohamed
 *    >Last Name = Ali
 *    >Mobie = 0504123456
 *    >Courses = cs102, cs202
 *
 * In addition, it adds the mobile phone number into an ArrayList called studentPhoneList
 * Print the content and the size of studentPhoneList
 */
package topic01.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Exerice1Files {
    
    public static void main(String[]args){
        String fileName = "files/students.txt";
        File file = new File(fileName);
        
        Scanner scanner=null;
        try{
             scanner = new Scanner(file);
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!");
            //System.exit(status);\
            return;
        }
        
       ArrayList<String> phones = new ArrayList<String>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] splittedString = line.split(":");
            System.out.println("ID = "+splittedString[0]);
            System.out.println("First Name = "+splittedString[1]);
            System.out.println("Last Name = "+splittedString[2]);
            System.out.println("Phone = "+splittedString[3]);
            System.out.print("Courses = ");
            phones.add(splittedString[3]);
            for (int i=4;i<splittedString.length;i++){
                System.out.print(splittedString[i]+", ");
            }
            System.out.println("\n");
        }
        
        System.out.println("Phones Length: "+phones.size());
        System.out.println("Phones: "+ phones);
        
        
    }    
}
