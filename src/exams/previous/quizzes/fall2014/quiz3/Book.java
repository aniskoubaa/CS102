package exams.previous.quizzes.fall2014.quiz3;
import java.util.*;

public class Book extends Publication {

    private double Price;
    private String ISBN;
    private String bookAbstract;
    
    
    
    public Book(String title, ArrayList <Author> a, Date d, String ISBN, double Price, String bookAbstract){
      super(title, a, d);
      setPrice(Price);
      setISBN(ISBN);
      setBookAbstract(bookAbstract);
      
    }
    
        public Book(){
        super();
    }

    public String getBookAbstract() {
        return bookAbstract;
    }

    public void setBookAbstract(String bookAbstract) {
        this.bookAbstract = bookAbstract;
    }
       
        
        
        
        @Override
    public String readAbstract(){
        return bookAbstract;
    }
    @Override
    public String readContent(){
       return bookAbstract; 
    }
    
    @Override
    public String readTitle(){
        return this.getTitle();
    }
    
    @Override
    public List<String> toArrayList(){
        List<String> list = new ArrayList<String>();
        list.add(this.getTitle());
        list.add(this.bookAbstract);
        list.add(bookAbstract);
        
        return list;
    }
    
    
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String isbn){
        if (isbn.length()==10)
            ISBN = isbn;
        else 
            ISBN="0000000000";
    }
    
    public double getPrice(){
        return Price;
    }
    
    public void setPrice(double Price){
        this.Price = Price;
    }
    
    
    public String toString(){
        String str = super.toString();
        return String.format("%s, ISBN-10: %s. Price: %.2f SAR", super.toString(), getISBN(), getPrice());
    }
    
   
}
