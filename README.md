
# Library Management System 

A brief description of what this project does and who it's for


## Description
This is a simple Python program that implements a basic Library Management System. The program allows users to:

1.View available books in the library.

2.Borrow books (if available).

3.Return books to the library.

4.Exit the system.
## Features

- Display Books: Lists all the books currently available in the library.
- Borrow a Book: Allows a user to borrow a book. The book is removed from the available list upon successful borrowing.
- Return a Book: Adds a returned book back to the library's list of available books.
- Exit: Ends the program.


## Program Structure
Class: Library

- The line if __name__ == "__main__": in Python is a common construct used to control the execution of code when a script is run directly versus when it is imported as a module into another script.
-__init__(self, books): Initializes the library with a list of books.

-display_books(self): Prints the list of available books.

-lend_book(self, book_name): Allows a user to borrow a book if it is available. If not, it informs the user.

-return_book(self, book_name): Accepts a book and adds it back to the library.

Main Functionality

-The program runs in a loop, displaying a menu for user interaction.

-Users can select options by entering numbers (1-4).

-Input validation is performed to handle invalid choices.
## Running Tests

To run tests, run the following command

```bash
  python library.py

```


## Sample Output
Library Menu:
1. Display Books
2. Borrow a Book
3. Return a Book
4. Exit
Enter your choice: 1

Available Books:
- 1984
- A Little Life
- Programming Python
- Fluent Python
- Python CookBook
- To kill a Mockingbird

