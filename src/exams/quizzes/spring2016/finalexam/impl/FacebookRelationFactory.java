package exams.quizzes.spring2016.finalexam.impl;

import exams.quizzes.spring2016.finalexam.interfaces.EdgeFactory;



/** question 01 **/
public class FacebookRelationFactory 
    implements EdgeFactory <FacebookRelation, FacebookUser>{

    @Override
    public FacebookRelation create(FacebookUser source, FacebookUser target) {
       return new FacebookRelation(source, target);
    }
    
    public FacebookRelation create(FacebookUser source, FacebookUser target, Date date) {
       return new FacebookRelation(source, target, date);
    }
    
}
