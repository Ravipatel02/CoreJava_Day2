package Question9;

public class LibrarySystem {
	
	public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe");
        Journal journal = new Journal("Computer Science Journal", 1);
        MultimediaResource multimedia = new MultimediaResource("Introduction to Algorithms Video", "Video");

        // Perform operations on library resources
        book.checkout();
        book.returnResource();

        journal.checkout();

        // Search for resources
        book.searchResource("Java Programming");
        journal.searchResource("Computer Science Journal");
        multimedia.checkout();
    }

}

