import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CC2 
{
    public static void main(String[] args) 
    {
        List<Book> list = new ArrayList<>();

        list.add(new Book(101, "Never Mind", 345));
        list.add(new Book(123, "Atomic Habit", 199));
        list.add(new Book(124, "Influenecer", 249));
        list.add(new Book(145, "Aryan", 0));

        // Collections.sort(list, new SortByTitle());
        // System.out.println("Sorted By Price : ");
        // list.forEach( e -> System.out.println(e.title+" "+e.price));

        // Collections.sort(list, (a,b) -> Integer.compare(b.price, a.price));
        // System.out.println("Sorted By Price : ");
        // list.forEach( e -> System.out.println(e.title+" "+e.price));

        list.sort(
            Comparator.comparing(Book::getId)
        );
        System.out.println("Sorted By Price : ");
        list.forEach( e -> System.out.println(e.title+" "+e.price));
    }    
}
class Book
{
    int id;
    String title;
    int price;

    public Book(int id, String title, int price)
    {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() 
    {
        return this.id;
    }
}

class SoryByPriceAsc implements Comparator<Book>
{
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b2.price, b1.price);
    }
}

class SortByTitle implements Comparator<Book>
{
    @Override
    public int compare(Book b1, Book b2) {
        return b2.title.compareTo(b1.title);
    }
}
