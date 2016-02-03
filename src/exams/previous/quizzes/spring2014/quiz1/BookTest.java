/*
 * 2.	Write a test program that creates two Book objects for these two books:
•“Java How to Program”, 9th Edition by Paul Deitel and Harvy Deitel, Publisher: Prentice Hall; 9 edition (March 7, 2011) ISBN-10: 0132575663 ISBN-13: 978-0132575669 Paperback: 1536 pages
•Peter Corke, “Robotics, Vision & Control”, Springer, 2011, ISBN 978-3-642-201
Display the information of both books. 

 */
package exams.previous.quizzes.spring2014.quiz1;

/**
 *
 * @author akoubaa
 */
public class BookTest {
    public static void main(String []args){
        
        String []authorsBook1 = {"Paul Deitel ", "Harvy Deitel"};
        Book book1 = new Book("Java How to Program", authorsBook1, "0132575663", 100.00);
        
        String []authorsBook2 = {"Peter Corke"};
        Book book2 = new Book("Robotics, Vision & Control", authorsBook2, "9783642201", 120.00);
        
        System.out.println(book1);
        System.out.println(book2);
        
    }
    
}
