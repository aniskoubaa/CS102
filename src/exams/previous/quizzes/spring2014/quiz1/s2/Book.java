/*
 1.	Write a class Book that has:
a.	four private attributes 
•	title, which specifies the title of the book 
•	String [] authors, an array that contains the names of the authors. We assume a book has a maximum of five authors. 
•	ISBN, which specifies the ISBN number of the book and is a String with exactly 10 digits.
•	price, which specifies the price of the book. It is a double.
b.	a method toString(), which returns a string representation of the Book class in the following format 
author1, author2 (…), “book title”, ISBN-10: ISBN,  Price= price.
Example: 
Paul Dietel, Harvy Dietel, “Java How to Program”, ISBN-10: 0132575663, Price: 200 SAR. 
c.	a constructor with four arguments that sets the values of instance variables to those passed as parameters. 
d.	a copy constructor. 
 */
package exams.previous.quizzes.spring2014.quiz1.s2;

/**
 *
 * @author akoubaa
 */
public class Book {
    
    
    private String title;
    private String [] authors = new String [5];
    private String isbn;
    private double price;
    
    public Book(){
        for (int i=0;i<authors.length;i++)
            authors[i]=null;
    }
    
    public Book(String title, String [] authors, 
            String isbn, double price){
        setTitle(title);
        setAuthors(authors);
        setIsbn(isbn);
        setPrice(price);
    }
    
    public Book(Book book){
        //setTitle(book.title);
        //setAuthors(book.authors);
        //setIsbn(book.isbn);
        //setPrice(book.price);
        this(book.title,book.authors,book.isbn,book.price);
    }
    
    public String getTitle(){
        return title;
    }
    
    public String [] getAuthors(){
        return authors;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public double getPrice(){
        return price;
    }
    
    
    public void setPrice(double price){
        /* if (price>0)
            this.price = price;
        else price = 0;
        */
        
        this.price = (price>0)?price:0;
        
    }
    
    public void setIsbn(String isbn){
        this.isbn = (isbn.length()==10)?isbn:"000000000";
        if (isbn.length()==10)
            this.isbn=isbn;
        else throw new IllegalArgumentException("ISBN format is not correct");
    }
    
    public void setAuthors(String [] authors){
        if (authors.length<=5){
            this.authors = authors;
        }
        else throw new IllegalArgumentException("authors length is not correct");
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String toString(){
        
        String allAuthors = "";
        for (int i=0;i<authors.length;i++){
            if (authors[i]!=null)
                allAuthors = allAuthors + authors[i]+", ";
        }
        //Paul Dietel, Harvy Dietel, “Java How to Program”, 
        //ISBN-10: 0132575663, Price: 200 SAR. 
        return String.format("%s \"%s\", ISBN-10: %s, Price: %.2f SAR", allAuthors, getTitle(),
                getIsbn(), getPrice());
            
        
    }
    
    
    
}
