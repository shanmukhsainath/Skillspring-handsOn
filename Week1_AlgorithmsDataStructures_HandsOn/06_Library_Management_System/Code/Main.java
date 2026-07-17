public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(301, "Clean Code", "Robert Martin"),
                new Book(302, "Effective Java", "Joshua Bloch"),
                new Book(303, "Java Basics", "Suresh Kumar"),
                new Book(304, "Spring in Action", "Craig Walls")
        };

        LibrarySearch librarySearch = new LibrarySearch();

        System.out.println("Linear search:");
        Book firstBook = librarySearch.linearSearch(books, "Java Basics");
        firstBook.displayBook();

        System.out.println("Binary search:");
        Book secondBook = librarySearch.binarySearch(books, "Spring in Action");
        secondBook.displayBook();
    }
}
