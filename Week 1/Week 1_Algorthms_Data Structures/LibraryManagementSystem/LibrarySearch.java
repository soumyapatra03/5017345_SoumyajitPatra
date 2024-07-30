import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    // Linear Search
    public static Book linearSearch(Book[] books, String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String searchTitle) {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midTitle = books[mid].getTitle().toLowerCase();

            if (midTitle.equals(searchTitle.toLowerCase())) {
                return books[mid];
            } else if (midTitle.compareTo(searchTitle.toLowerCase()) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
