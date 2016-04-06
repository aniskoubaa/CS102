package topic05.generics;

import topic05.generics.*;

public class GenericMethods {
    
    /*
    public static void printArray(Integer [] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        
    }
    
    public static void printArray(Double [] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("");        
    }   
    
    public static void printArray(Character [] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        
    }
    */
    
    public static int linearSearch(int [] A, int key){
        
        for (int i=0;i<A.length;i++){
            if (key == A[i]){
                return i;
            }
        }
        return -1;
        
    }
    
    public static <T extends Comparable<T>> int linearSearch(T [] A, T key){
        for (int i=0;i<A.length;i++){
            if (A[i].compareTo(key)==0){
                return i;
            }
        }
        return -1;
    }
    
    public static int linearSearch(String [] A, String key){
        
        for (int i=0;i<A.length;i++){
            if (key.equals(A[i])){
                return i;
            }
        }
        return -1;
        
    }
    
    public static <T> void printArray(T [] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        
    }
    

    
    /*
    public static Integer max(Integer x1, Integer x2, Integer x3){
       Integer max=x1;
        if (max<x2)
            max=x2;
        if (max<x3)
            max=x3;
           return max;
    }
    
    public static Double max(Double x1, Double x2, Double x3){
       Double max=x1;
        if (max<x2)
            max=x2;
        if (max<x3)
            max=x3;
           return max;
    }*/
    
    
        
        
    
    public static <T extends Comparable<T>> T 
        max(T x1, T x2, T x3){
       T max=x1;
        if (max.compareTo(x2)<0)
            max=x2;
        if (max.compareTo(x3)<0)
            max=x3;
           return max;
    }
    
    
    
    
    
    
        
         
    public static void main(String []args){
        
        Integer [] integerArray = {1, 2, 3, 4, 57, 89};
        Double [] doubleArray = {2.3, 5.6, 9.2, 4.7};
        Character [] charArray = {'c', 's', '1', '0', '2'};
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setId("11");
        s2.setId("12");
        s3.setId("13");
        Student [] students = {s1, s2, s3};
        
        //printArray(integerArray);
        //printArray(doubleArray);
        //printArray(charArray);
        
        String x = "ss";
        String y = "RE";
        String z= "aer";
        
        System.out.println(max(10.2, 4.3,5.9));
        
        System.out.println(max(x, y,z));
        
        System.out.println(max(s1, s2,s3));
        
        
        //
        System.out.println("Position of 57: "+ 
                linearSearch(integerArray, 57)); //4
        
        System.out.println("Position of 9.2: "+ 
                linearSearch(doubleArray, 9.0)); //2
        
        System.out.println("Position of '0': "+ 
                linearSearch(charArray, '0')); //3
        Student s4 = new Student();
        s4.setId("15");
        s2.setId("15");
        System.out.println("Position of s2: "+ 
                linearSearch(students, s2)); //1
        
        
    }
    
}
