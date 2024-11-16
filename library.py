class Library:
    def __init__(self, books):
        self.books = books

    def display_books(self):
        print("\nAvailable Books:")
        for book in self.books:
            print(f"- {book}")

    def lend_book(self, book_name):
        if book_name in self.books:
            self.books.remove(book_name)
            print(f"\nYou borrowed '{book_name}'. Please return it on time!")
        else:
            print(f"\nSorry, '{book_name}' is not available.")

    def return_book(self, book_name):
        self.books.append(book_name)
        print(f"\nThank you for returning '{book_name}'!")

# Main Function
if __name__ == "__main__":
    my_library = Library(["1984","A Little Life","Programming Python", "Fluent Python", "Python CookBook","To kill a Mockingbird"])

    while True:
        print("\nLibrary Menu:")
        print("1. Display Books")
        print("2. Borrow a Book")
        print("3. Return a Book")
        print("4. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            my_library.display_books()
        elif choice == "2":
            book = input("\nEnter the name of the book to borrow: ")
            my_library.lend_book(book)
        elif choice == "3":
            book = input("\nEnter the name of the book to return: ")
            my_library.return_book(book)
        elif choice == "4":
            print("\nThank you for using the library!")
            break
        else:
            print("\nInvalid choice. Please try again.")