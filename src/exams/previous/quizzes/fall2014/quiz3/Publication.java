package exams.previous.quizzes.fall2014.quiz3;

import java.util.*;

public abstract class Publication 
implements Readable, Comparable <Publication>{
    
    private String title;
    private ArrayList <Author>authors;
    private Date PublicationDate;
    
       
    
    public static int count = 0;
    
    public Publication(){
        
    }
    
    Publication (String title, ArrayList <Author> authorList, Date d){
        setTitle(title);
        setAuthors(authorList);
        setPublicationDate(d);
        count++;        
    }
    
    
       
    public void setPublicationDate(Date d){
        if (d.getYear()>1900)
            PublicationDate = d;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setAuthors(ArrayList <Author> authorList){
        authors = authorList;
    }
    
    public String getTitle(){
        return title;
    }
    
    public ArrayList <Author> getAuthors(){
        return authors;
    }
    
    public Date getPublicationDate(){
        return PublicationDate;
    }
    
    public int compareTo(Publication p){
        return this.getTitle().compareTo(p.getTitle());
    }
    

    
    public String toString(){
        
        String authorsList = "";
        for (int i=0; i<authors.size()-1;i++)
            authorsList = authorsList + authors.get(i) +", ";                          
        authorsList = authorsList + authors.get(authors.size()-1);
        return String.format("%s, \"%s\", %s", authorsList, getTitle(), getPublicationDate());
    }
    
    
}
