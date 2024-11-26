import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<String> books;

    // Constructor to initialize the list of books
    public Library(ArrayList<String> books) {
        this.books = books;
    }

    // Method to display available books
    public void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    // Method to lend a book
    public void lendBook(String bookName) {
        if (books.contains(bookName)) {
            books.remove(bookName);
            System.out.println("\nYou borrowed '" + bookName + "'. Please return it on time!");
        } else {
            System.out.println("\nSorry, '" + bookName + "' is not available.");
        }
    }

    // Method to return a book
    public void returnBook(String bookName) {
        books.add(bookName);
        System.out.println("\nThank you for returning '" + bookName + "'!");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> initialBooks = new ArrayList<>();
        initialBooks.add("1984");
        initialBooks.add("A Little Life");
        initialBooks.add("The Hobbit");
        initialBooks.add("The Book Thief");
        initialBooks.add("War and Peace");
        initialBooks.add("To Kill a Mockingbird");

        Library myLibrary = new Library(initialBooks);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    myLibrary.displayBooks();
                    break;
                case "2":
                    System.out.print("\nEnter the name of the book to borrow: ");
                    String bookToBorrow = scanner.nextLine();
                    myLibrary.lendBook(bookToBorrow);
                    break;
                case "3":
                    System.out.print("\nEnter the name of the book to return: ");
                    String bookToReturn = scanner.nextLine();
                    myLibrary.returnBook(bookToReturn);
                    break;
                case "4":
                    System.out.println("\nThank you for using the library!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
