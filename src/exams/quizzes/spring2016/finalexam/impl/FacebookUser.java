/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quizzes.spring2016.finalexam.impl;

import exams.quizzes.spring2016.finalexam.interfaces.IVertex;



public class FacebookUser implements IVertex,  Comparable<FacebookUser>{

    private int id;
    private String name;
    private String email;

    public FacebookUser(){
        
    }
    public FacebookUser(int id, String data){
        setID(id);
        setName(data);
    }
    
    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getData() {
        return name;
    }

    @Override
    public void setID(int id) {
        this.id=id;
    }

    @Override
    public void setData(String data) {
        this.name=data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof FacebookUser){
            FacebookUser fu = (FacebookUser) o;
            if (fu.getID()==this.getID())
                return true;
        }
        return false;
    }
    
    public String toString(){
        return id+";"+name+";"+email;
    }

    @Override
    public int compareTo(FacebookUser u) {
        return this.getName().compareTo(u.name);
    }
    
}
