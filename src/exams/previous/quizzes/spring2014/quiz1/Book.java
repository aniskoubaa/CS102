/*
 Book Class	Grade: 5 points	Duration: 20 minutes

1.Write a class Book that has:
a.three private attributes 
•	title, which specifies the title of the book 
•	String [] authors, an array that contains the names of the authors. We assume a book has a maximum of five authors. 
•	ISBN, which specifies the ISBN number of the book and is a String with exactly 10 digits.
•	price, which specifies the price of the book. It is a double.
b. a method toString(), which returns a string representation of the Book class in the following format 
author1, author2 (…), “book title”, ISBN-10: ISBN,  Price= price.
Example: 
Paul Dietel, Harvy Dietel, “Java How to Program”, ISBN-10: 0132575663, Price: 200 SAR. 
c. a constructor with four arguments that sets the values of instance variables to those passed as parameters. 
d. a copy constructor. 

 */
package exams.previous.quizzes.spring2014.quiz1;

/**
 *
 * @author akoubaa
 */
public class Book {
    
    private String title;
    private String [] authors = new String [5];
    private String ISBN;
    private double price;
    
    public Book(String title, String [] a, String isbn, double price){
        setTitle(title);
        setAuthors(a);
        setISBN(isbn);
        setPrice(price);
    }
    
    public Book(){
        for (int i=0;i<authors.length;i++){
            authors[i]=null;
        }
    }
    
    public Book (Book book){
        this(book.title, book.authors, book.ISBN, book.price);
    }
    
    public String getTitle(){
        return title;
    }
    
    public String [] getAuthors(){
        return authors;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setAuthors(String [] a){
        if (a.length<=5){
            authors = a;
        }else
            throw new IllegalArgumentException("Authors parameter is not valid");
    }
    
    public void setISBN(String isbn){
        if (isbn.length()==10){
            ISBN= isbn;
        }else
            throw new IllegalArgumentException("ISBN parameter is not valid");
    }
    
    public void setPrice(double price){
        //equivalent to if statement
        this.price = (price>0)?price:0;
        /*
        if (price>0){
            this.price = price;
        }else price = 0;
        */
    }
    
    
    
    
    //Paul Dietel, Harvy Dietel, “Java How to Program”, 
    //ISBN-10: 0132575663, Price: 200 SAR.
    
    public String toString(){
        String allAuthors ="";
        
        for (int i=0;i<authors.length;i++){
            if (authors[i]!=null)
                allAuthors=allAuthors+authors[i]+", ";
            else break;
            
        }
        
        return String.format("%s \"%s\" ISBN-10: %s, Price: %.2f SAR", allAuthors, 
                getTitle(), getISBN(), getPrice());
    }
    
    
    
    
}
