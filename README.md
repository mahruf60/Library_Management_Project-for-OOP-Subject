
# Library Management System 
## Overview
This Java program implements a simple Library Management System. It allows users to manage a collection of books, including viewing available books, borrowing books, and returning books. The program operates in a menu-driven manner, allowing users to choose actions in a loop until they choose to exit.


## Features
#### 1.Display Books
Lists all the books currently available in the library.

#### 2.Borrow a Book

Users can borrow a book by entering its name. If the book is available, it is removed from the library's collection. If the book is unavailable, the user is notified.

#### 3.Return a Book
Users can return a book by entering its name. The book is then added back to the library's collection.

#### 4.Exit
Ends the program and thanks the user for using the library system.

## Code Structure

1.Library Class

- Fields:

   - books: A list (ArrayList<String>) that stores the names of books in the library.

- Methods:

   - Library(ArrayList<String> books): Constructor to initialize the library with a list of books.
   - displayBooks(): Displays all available books.
   - lendBook(String bookName): Removes a book from the library if available and notifies the user. Otherwise, it informs the user that the book is unavailable.
   - returnBook(String bookName): Adds a returned book back to the library's collection and acknowledges the user.

2.LibraryManagementSystem Class

- Purpose: Contains the main method, which serves as the program's entry point.
- Functionality

   - Initializes the library with a predefined list of books.
   - Displays a menu for user interaction:

      1.Display available books.

      2.Borrow a book.

      3.Return a book.
      
      4.Exit the program.
- Uses a while loop for continuous interaction until the user chooses to exit    

## How to Run

1. Prerequisites:
  - Install Java Development Kit (JDK) on your system.

  - Set up a Java IDE (e.g., IntelliJ IDEA, Eclipse) or use a terminal/command prompt.
2. Steps:
  - Save the code into a file named LibraryManagementSystem.java.
  - Compile the program using the command:

    javac LibraryManagementSystem.java
  - Run the program using:

    java LibraryManagementSystem
3. Usage:
  - Follow the on-screen menu prompts to interact with the library:
     
     - Choose options by entering the corresponding number.
     - Input book names when prompted.

## Example Walkthrough

1. Starting the Program:
   
  Library Menu:
  1. Display Books
  2. Borrow a Book
  3. Return a Book
  4. Exit
  Enter your choice: 1

2.Displaying Books:
  
  Available Books:
- 1984
- A Little Life
- The Hobbit
- The Book Thief
- War and Peace
- To Kill a Mockingbird

3.Borrowing a Book:

- Enter your choice: 2

- Enter the name of the book to borrow: 1984

- You borrowed '1984'. Please return it on time!

4.Returning a Book:

- Enter your choice: 3

- Enter the name of the book to return: 1984

- Thank you for returning '1984'!

5.Exiting:

- Enter your choice: 4

- Thank you for using the library!
