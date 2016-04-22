/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz4;


public class OrderView {
    
    Store store = Store.getInstance();
    
    public void printAllOrders(){
        
        System.out.println(store.getOrders());
    }
    
}
