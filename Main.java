import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<Book> books = new ArrayList<>();

       books.add(new Book("Matthew", "title", 200));
       books.add(new Book("Zed", "name", 891));
       books.add(new Book("Azul", "another", 34));

       //Collections.sort(books);
       Collections.sort(books, new BookComparator().reversed());
       System.out.println(books);

    }
}