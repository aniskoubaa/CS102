/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic05.generics;

import java.util.ArrayList;
import topic04.polymorphism.employees.*;

/**
 *
 * @author akoubaa
 */
public class StackDemo {
    public static void main(String []args) throws Exception{
     
        ArrayList<String> sl = new ArrayList();
        
        Stackable<CommissionEmployee> employeeStack = 
                new Stack();
        Stackable<Student> studentStack = 
                new Stack<Student>();
        Stackable<Double> doubleStack = 
                new Stack<Double>();
        
        Stack stack = new Stack();
        
        CommissionEmployee cm = 
                new CommissionEmployee
                        ("Mohamed", "Ali", "333-33-3333", 5000, 0.04);
        
        employeeStack.push(cm);
        
        studentStack.push(new Student("fn", "ln", "mp", "id"));
        
        doubleStack.push(5.3);
        doubleStack.push(7.4);
         doubleStack.push(8.9);
          doubleStack.push(0.3);
           doubleStack.push(3.6);
           doubleStack.print();
           
           while(!doubleStack.isEmpty()){
               doubleStack.pop();
            doubleStack.print();
           }
           
           /*
           doubleStack.pop();
           doubleStack.print();
          
           doubleStack.pop();
           doubleStack.print();
            
           doubleStack.pop();
           doubleStack.print();
           
           stack.push(cm);
           stack.push(8.99);
           //stack.push(studentStack.pop());
        stack.print();
     */
    }
}
