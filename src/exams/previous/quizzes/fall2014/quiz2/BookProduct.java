package exams.previous.quizzes.fall2014.quiz2;

public class BookProduct extends Product{
    
    private String []authors;
    private int numberOfAuthors;
    private String isbn;

    public BookProduct(String[] authors, String isbn, int id, String label, double price) {
        super(id, label, price);
        setAuthors(authors);
        setNumberOfAuthors(authors.length);
        setIsbn(isbn);
    }
    
    public String getTitle(){
        return getLabel();
    }
    
    public void setTitle(String title){
        setLabel(title);
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn.length()==6)
        this.isbn = isbn;
        else 
            throw new IllegalArgumentException("invalid isbn");
    }
//BookProduct{Product{ID=1, label=Java Programming, price=120.35}}
    @Override
    public String toString() {
        return String.format("BookProduct{%s}", super.toString());
    }
    
    
    
}
