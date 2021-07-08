import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;


public class Main {


    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Harry Potter and the Philosopher's Stone", 332, "J. K. Rowling0", new Date(0)));
        books.add(new Book("Harry Potter and the Chamber of Secrets", 360, "J. K. Rowling0", new Date(0)));
        books.add(new Book("Harry Potter and the Prisoner of Azkaban", 462, "J. K. Rowling0", new Date(0)));
        books.add(new Book("Harry Potter and the Goblet of Fire", 617, "J. K. Rowling0", new Date(0)));
        books.add(new Book("Harry Potter and the Order of the Phoenix", 800, "J. K. Rowling0", new Date(0)));

        for (Book b : books)
        {
            System.out.println(b.getName());
        }

        TreeSet<Book> books_SortPages = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPages() - o1.getPages();
            }
        });

        books_SortPages.add(new Book("Harry Potter and the Philosopher's Stone", 332, "J. K. Rowling0", new Date(0)));
        books_SortPages.add(new Book("Harry Potter and the Chamber of Secrets", 360, "J. K. Rowling0", new Date(0)));
        books_SortPages.add(new Book("Harry Potter and the Prisoner of Azkaban", 462, "J. K. Rowling0", new Date(0)));
        books_SortPages.add(new Book("Harry Potter and the Goblet of Fire", 617, "J. K. Rowling0", new Date(0)));
        books_SortPages.add(new Book("Harry Potter and the Order of the Phoenix", 800, "J. K. Rowling0", new Date(0)));

        System.out.println();
        for (Book b : books_SortPages)
        {
            System.out.println(b.getName());
        }

    }



}
