public class LibrarySearch {
    public Book linearSearch(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearch(Book[] books, String title) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int result = books[middle].getTitle().compareToIgnoreCase(title);

            if (result == 0) {
                return books[middle];
            } else if (result < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return null;
    }
}
