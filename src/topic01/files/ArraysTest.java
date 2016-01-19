/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.files;

import java.util.ArrayList;
import java.util.Scanner;


public class ArraysTest {
    public static void main(String []args){
        
        //static arrays
        int [] ArrayOfIntegers = new int[5];
        String [] ArrayOfStrings = {"CS102", "CS101", "CS210"};
        //dynamic arrays
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
         ArrayList<Double> doubleList = new ArrayList<Double>();
        
        double [][] matrix2d = new double [5][7];
        
        for (int i=0;i<ArrayOfIntegers.length;i++){
            ArrayOfIntegers[i]=2*i;
            System.out.printf("ArrayOfIntegers[%d]= %d\n", i, 
                    ArrayOfIntegers[i]);
        }
        
        for (int i=0;i<ArrayOfStrings.length;i++){
            System.out.printf("ArrayOfStrings[%d]= %s\n", i, 
                    ArrayOfStrings[i]);
        }
        
        for (int r=0;r<matrix2d.length;r++){
            for(int c=0;c<matrix2d[r].length;c++){
                matrix2d[r][c] = Math.random()*10;
                System.out.printf("%.2f\t",
                        matrix2d[r][c]);
            }
            System.out.println("");
        }
        
        System.out.println("stringList Size: "+ stringList.size());
        System.out.println("stringList: "+ stringList);
        
        stringList.add("CS102");
        System.out.println("stringList Size: "+ stringList.size());
        System.out.println("stringList: "+ stringList);
        
        stringList.add("CS101");
        System.out.println("stringList Size: "+ stringList.size());
        System.out.println("stringList: "+ stringList);
        
        stringList.add("CS210");
        System.out.println("stringList Size: "+ stringList.size());
        System.out.println("stringList: "+ stringList);
        
        stringList.remove("CS101");
        System.out.println("stringList Size: "+ stringList.size());
        System.out.println("stringList: "+ stringList);
    
        Scanner input = new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("Enter a value: ");
            //String s = input.next();
            //stringList.add("CS");
            System.out.println("stringList Size: "+ stringList.size());
            System.out.println("stringList: "+ stringList);
    
        }
        
        for (int i=0;i<stringList.size();i++){
            System.out.printf("stringList[%d]= %s\n", i, stringList.get(i));
        }
        
        //enhanced for statement: for each element
        for (String s : stringList){
            System.out.println(s);
        }
        
        
    }
    
    
}
