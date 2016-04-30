package topic08.recursion;


public class Factorial {
    
    //iterative method
    public static long factorial (long number){
        
        int product = 1;
        if (number == 0 ) return 1;
        for (int i=2;i<=number;i++){
            product *=i;
        }
        
        return product;
    }
    public static long facto(long n){
        if (n==1) return 1;//base case
        return n*facto(n-1);
                
                
                
                
    }
    
    
    
    
    public static long fact(long n){
       //stopping condition or case case
        if (n==1) return 1;
        System.out.println("n="+n);
        return n*fact(n-1);
    }
    
    //https://www.cs.usfca.edu/~galles/visualization/RecFact.html
    public static long rfactorial (long number){
        
        if (number == 0 ) return 1;
        
        return number * factorial(number-1);
        
    }
    
    public static void main(String []args){
        
        int [] ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("Factorial");
        for (int v : ints){
            System.out.printf("%d! = %d\n", v, factorial(v));
        }
        
        System.out.println("\nRecursive Factorial");
        for (int v : ints){
            System.out.printf("%d! = %d\n", v, factorial(v));
        }
        
        System.out.println("facto(5)= "+facto(5));
        
    }
    
}
