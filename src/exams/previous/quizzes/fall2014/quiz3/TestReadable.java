package exams.previous.quizzes.fall2014.quiz3;
import java.util.ArrayList;

public class TestReadable {
    public static void main(String [] args){

        Date dateBook1 = new Date(10, 10, 2010);
        Date dateBook2 = new Date(5, 9, 2012);
        
        Author author1 = new Author ("Anis", "Koubaa");
        Author author2 = new Author ("Basit", "Qurashi");
        Author author3 = new Author ("Mohamed", "Affendi");
        
        ArrayList <Author>  authors_book1 = new ArrayList<Author>();
        ArrayList <Author> authors_book2 = new ArrayList<Author>();
        
        authors_book1.add(author1);
        authors_book1.add(author2);
        authors_book2.add(author3);
        
        Book [] books = new Book [2];

        books[0] = new Book ("Computer Programming", authors_book1, dateBook1, "1234567891", 220.00,"Abstract of Book[0]");
        books[1] = new Book ("Networking", authors_book2, dateBook2, "9512357124", 120.00, "Abstract Book [1]");
        
        Conference [] papers = new Conference [2];
        
        ArrayList <Author>  authors_paper1 = new ArrayList<Author>();
        ArrayList <Author> authors_paper2 = new ArrayList<Author>();
        
        authors_paper1.add(new Author ("Imen", "Chaari"));
        authors_paper1.add(new Author ("Anis", "Koubaa"));
        authors_paper1.add(new Author ("Hachemi", "Bennaceur"));
        authors_paper1.add(new Author ("Adel", "Ammar"));
        Date datePaper1=new Date(15,6,2014);
        
        papers[0] = new Conference ("On the Adequacy of Tabu Search for Global Robot Path Planning Problem in Grid Environments", authors_paper1, datePaper1, "5th International Conference on Ambient Systems, Networks and Technologies (ANT-2014)", "Belgium", "Paper Abstract", "Paper Content");
        
        authors_paper2.add(new Author ("Omar", "Cheikhrouhou"));
        authors_paper2.add(new Author ("Anis", "Koubaa"));
        authors_paper2.add(new Author ("Hachemi", "Bennaceur"));
        Date datePaper2=new Date(15,5,2014);
        papers[1] = new Conference ("Move and Improve: A Distributed Multi-Robot Coordination Approach for Multiple Depots Multiple Travelling Salesmen Problem", authors_paper2, datePaper2, " IEEE International Conference on Autonomous Robot Systems and Competitions (Robotica 2014)", "Portugal","Paper Abstract", "Paper Content");

        ArrayList<Readable> readableObjects  = new ArrayList<Readable>();
        readableObjects .add(books[0]);
        readableObjects .add(books[1]);
        readableObjects .add(papers[0]);
        readableObjects .add(papers[1]);
        
        
        for (Readable readable: readableObjects){
            System.out.println("\nReadable Object");
            System.out.println("Title: "+readable.readTitle());
            System.out.println("Abstract: "+readable.readAbstract());
            System.out.println("Content: "+readable.readContent());
            
            if (readable instanceof Conference){
                Conference c = (Conference)(readable);
                System.out.println("Location: "+c.getConferenceLocation());
                System.out.println("Name: "+c.getConferenceName());
                
            }
            
        }
        
        
        
               
        
    }
    
}
