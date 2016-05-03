
package topic08.recursion;


public class ExponentialTaylor {
    
    
    public static double eTwo(double x, int n){
        if(n==0)
            return 1;
        else {
            //System.out.println(eTwo(x,n-1));
            return eTwo(x,n-1) + Math.pow(x, n)/factorial(n);
        }
    }
    
    public static double eTwo1(double x, int n){
        if(n==0)
            return Math.E;
        else {
            //System.out.println(eTwo(x,n-1));
            return eTwo(x,n-1) + ((Math.E*Math.pow(x-1, n))/factorial(n));
        }
    }

    public static double factorial (int n){
        if(n==0)
            return 1;
        else 
            return n*factorial(n-1);
    }
    
    public static void main(String []args){
        
        
        for (int i=2;i<3;i++){
            System.out.println("eTwo("+i+",10): "+eTwo(i,10));
            System.out.println("eTwo1("+i+",10): "+eTwo1(i,10));
            System.out.println("Math.exp("+i+"): "+Math.exp(i));
            System.out.println("");
        }
        
    }

    
}
