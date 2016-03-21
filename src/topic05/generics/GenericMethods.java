package topic05.generics;

public class GenericMethods {
    
/*
    public static void printArray(Integer [] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }
    
    
    
    public static void printArray(Character [] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }
    
    */
    
    
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
    }
    
    public static <T extends Comparable <T>> T max(T x1, T x2, T x3){
       T max=x1;
        if (max.compareTo(x2)<0)
            max=x2;
        if (max.compareTo(x3)<0)
            max=x3;
           return max;
    }
    
    public static <T> void printArray(T [] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        } 
        
        for (T t: array){
            System.out.println(t);
        }
    }
    
    
        
         
    public static void main(String []args){
        
        Integer [] integerArray = {1, 2, 3, 4, 57, 89};
        Double [] doubleArray = {2.3, 5.6, 9.2, 4.7};
        Character [] charArray = {'c', 's', '1', '0', '2'};
        
        //printArray(integerArray);
        //printArray(doubleArray);
        //printArray(charArray);
        
        String x = "ss";
        String y = "RE";
        String z= "wer";
        
        System.out.println(max(10.2, 4.3,5.9));
        
        System.out.println(max(x, y,z));
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setId("14");
        s2.setId("12");
        s3.setId("13");
        
        System.out.println(max(s1, s2,s3));
        
    }
    
}
