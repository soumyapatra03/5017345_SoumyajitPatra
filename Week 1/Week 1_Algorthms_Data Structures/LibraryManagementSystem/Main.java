import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
        };

        String searchTitle = "1984";

        // Linear Search
        Book foundBook = LibrarySearch.linearSearch(books, searchTitle);
        System.out.println("Linear Search Result: " + foundBook);

        // Binary Search (Ensure list is sorted)
        Book[] sortedBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });
        foundBook = LibrarySearch.binarySearch(sortedBooks, searchTitle);
        System.out.println("Binary Search Result: " + foundBook);
    }
}
