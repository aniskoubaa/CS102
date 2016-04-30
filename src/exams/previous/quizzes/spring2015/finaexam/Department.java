/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;

/**
 *
 * @author akoubaa
 */
public class Department {
    
    String name;
    String buiding;

    public Department(String name, String buiding) {
        this.name = name;
        this.buiding = buiding;
    }

    @Override
    public String toString() {
        return "{" + "" + name + ", " + buiding + '}';
    }
    
    
    
}
