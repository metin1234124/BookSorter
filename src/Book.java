import java.util.*;
public class Book implements Comparable<Book>{
    private String name;
    private int numberOfPages;
    private String authorName;
    private int publicationDate;


    public Book(String name, int numberOfPages, String authorName, int publicationDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }
    public Book(){

    }

    @Override
    public int compareTo(Book other) {

        return this.getName().compareTo(other.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}
