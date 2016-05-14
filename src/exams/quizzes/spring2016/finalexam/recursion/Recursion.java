/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quizzes.spring2016.finalexam.recursion;

/**
 *
 * @author akoubaa
 */
public class Recursion {
    
    
    /** TODO: complete the following recursion function 
     *         x: value between -1 and 1
     *         n: number of iterations
     *         result: you must return the output of the approximated function value for x using Taylor expansion
     */
    public static double f(double x, int n){
        
    }
    
    
    /** DO NOT CHANGE: the real function */
    public static double f(double x){        
        return (1/Math.pow((1-x),2));
    }
    
    
    /** test cases **/
    public static void main(String []args){
        
        double [] xd = {0.2, -0.35, 0.45, -0.55, -0.6, 0.9};
        
        for (double x : xd){

            System.out.printf("f(%.2f)=%.10f\n", x, f(x));
            //System.out.printf("f(%.2f, 2)=%.10f, error = %.10f\n", x, f(x,2), f(x)-f(x,2));
            System.out.printf("f(%.2f, 10)=%.10f, error = %.10f\n", x, f(x,10), f(x)-f(x,10));
            System.out.printf("f(%.2f, 100)=%.10f, error = %.10f\n", x, f(x,200), f(x)-f(x,200));
            System.out.println("");
            
        }
        
        
    }   
}

