package exams.quizzes.spring2016.finalexam.impl;

import exams.quizzes.spring2016.finalexam.interfaces.IEdge;
import exams.quizzes.spring2016.finalexam.interfaces.IVertex;



public class FacebookRelation implements IEdge{

    
    protected FacebookUser sourceUser;
    protected FacebookUser targetUser;
    protected Date date;
    
    public FacebookRelation(FacebookUser s, FacebookUser t){
        sourceUser=s;
        targetUser=t;
    }
    
    public FacebookRelation(FacebookUser s, FacebookUser t, Date d){
        sourceUser=s;
        targetUser=t;
        date=d;
    }

    @Override
    public IVertex getSource() {
        return sourceUser;
    }

    @Override
    public IVertex getTarget() {
        return targetUser;
    }

    @Override
    public void setSource(IVertex v) {
        if (v instanceof FacebookUser)
        this.sourceUser=(FacebookUser)v;
    }

    @Override
    public void setTarget(IVertex v) {
        if (v instanceof FacebookUser)
        this.targetUser=(FacebookUser)v;
    }
    
}
