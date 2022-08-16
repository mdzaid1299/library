


public class BookImlp {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setTitle("Book");
        System.out.println("Title of the book = " + obj.getTitle());
        obj.setPublicationYear(2045);
        System.out.println("Year of publication = " + obj.getPublicationYear());
        obj.setIsbn(637248563485L);
        System.out.println("ISBN = " + obj.getIsbn());
        obj.setAuthorName("MDZAID");
        System.out.println("Author name = " + obj.getAuthorName());
    }
}