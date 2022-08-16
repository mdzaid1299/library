public class Book {
    private String title;
    private int PublicationYear;
    private long ISBN;
    private String authorName;
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return  title;
    }
    public void setPublicationYear(int year_Of_Publication){
        this.PublicationYear = year_Of_Publication;
    }
    public int getPublicationYear(){
        return PublicationYear;
    }
    public void setIsbn(long isbn){
        this.ISBN = isbn;

    }
    public long getIsbn(){
        return ISBN;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return  authorName;
    }
}