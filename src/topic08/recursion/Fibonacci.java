
package topic08.recursion;


public class Fibonacci {
    
    /** series: xn=f(x(n-1));
     * f(0)= 0
     * f(1)= 1
     * f(n)= f(n-1)+f(n-2)
     * f(2)= f(1)+f(0)=1+0=1
     * f(3)= f(2)+f(1)=1+1=2
     * fn2=f(2)
     * fn1=f(3)
     * f(4)=fn1+fn2=f(3)+f(2)=2+1=3
     * fn2=f(3)
     * fn1=f(4)
     * f(5)=f(4)+f(3)=3+2=5
     * fn2=f(4)
     * fn1=f(5)
     */
    
    public static long fibo(long n){
        //base case;
        //if (n == 0 ) return 0;
        //if (n == 1 ) return 1;
        if (n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    
    public static long fib(long n){
        if (n<0) return -1;
        //base case
        if (n<=1) return n;
        
        return fib(n-1)+fib(n-2);
        /*
        n=4
        return fib(3)+fib(2)
               fib(3)==>fib(2)+fib(1)=fib(2)+1
                      fib(2)=fib(1)+fib(0)=1+0=1
                fib(3)==>fib(2)+fib(1)=fib(2)+1=1+1=2
        return 2+1=3
        
        */
        
        
    }
    
    public static long fibonacci (long number){
        
        //base case
        if (number == 0 ) return 0;
        if (number == 1 ) return 1;
        
        long fn=0;
        long fn2=0; //f0
        long fn1=1; //f1
        
        
        for (int i=2;i<=number;i++){
            fn = fn1+fn2;
            fn2=fn1;
            fn1=fn;            
        }
        
        return fn;
    }
    
    public static long rfibonacci (long number){
        
        if (number <= 1) return number;
        else return rfibonacci(number-1) + rfibonacci(number-2);
        
    }
    
    public static void main(String []args){
        
        int [] ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("Factorial");
        for (int v : ints){
            System.out.printf("fibonacci(%d) = %d\n", v, fibonacci(v));
        }
        
        System.out.println("\nRecursive Factorial");
        for (int v : ints){
            System.out.printf("fibo(%d) = %d\n", v, fib(v));
        }
        
        //System.out.printf("fibonacci(%d) = %d\n", 10000, fibonacci(10000));
         //System.out.printf("fibo(%d) = %d\n", 10000, fibo(10000));
        
    }
    
    
}
