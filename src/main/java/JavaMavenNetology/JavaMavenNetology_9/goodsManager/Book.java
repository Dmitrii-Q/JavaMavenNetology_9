package JavaMavenNetology.JavaMavenNetology_9.goodsManager;

public class Book extends Product {
    private String name;
    private String author;

    public Book(int ID, String name, int price, String author) {
        super(ID, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
