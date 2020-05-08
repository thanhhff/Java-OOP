package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable {
    private List<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentTokens;
    private Map<String, Integer> wordFrequency;

    public Book() {
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String authorName) {
        if (!(authors.contains(authorName))) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void processContent(){
        
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;

        if (this.getTitle().compareToIgnoreCase(book.getTitle()) > 0)
            return 1;
        else if (this.getTitle().compareToIgnoreCase(book.getTitle()) < 0)
            return -1;
        else if (this.getTitle().compareToIgnoreCase(book.getTitle()) == 0) {
            if (this.getCost() > book.getCost())
                return 1;
            else if (this.getCost() < book.getCost())
                return -1;
        }

        return 0;
    }
}
