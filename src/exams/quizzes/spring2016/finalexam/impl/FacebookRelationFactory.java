package exams.quizzes.spring2016.finalexam.impl;

import exams.quizzes.spring2016.finalexam.interfaces.EdgeFactory;



/** question 01 **/
public class FacebookRelationFactory 
    implements EdgeFactory <FriendshipRelation, FacebookUser>{

    @Override
    public FriendshipRelation create(FacebookUser source, FacebookUser target) {
       return new FriendshipRelation(source, target);
    }
    
    public FriendshipRelation create(FacebookUser source, FacebookUser target, Date date) {
       return new FriendshipRelation(source, target, date);
    }
    
}
