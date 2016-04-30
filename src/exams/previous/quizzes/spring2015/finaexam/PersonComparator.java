/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;

import java.util.Comparator;

public class PersonComparator implements Comparator <Person>{
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getBirthDate().compareTo(p2.getBirthDate());
    }
}
