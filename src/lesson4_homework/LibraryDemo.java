package lesson4_homework;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        initData(library);
        library.printAuthors();
        library.printBooks();
    }

    private static void initData(Library library) {
        InputBook inputBook1 = new InputBook();
        inputBook1.setName("Koronacija");
        inputBook1.setBookBornYear(1992);
        inputBook1.setAmountOfPages(500);
        Book book1 = valueOf(inputBook1);
    }

    private static Book valueOf(InputBook inputBook) {
        Book book = new Book();
        book.setBookName(inputBook.getName());
        book.setBookBornYear(inputBook.getBookBornYear());
        book.setAmountOfPages(inputBook.getAmountOfPages());
        return book;
    }

    private static Author valueOf(InputAuthor inputAuthor) {
        Author author = new Author(null);
        author.setFamilyName(inputAuthor.getFamilyName());
        author.setName(inputAuthor.getName());
        author.setDateOfBorn(inputAuthor.getDateOfBorn());
        return author;
    }

}
