package lesson4_homework;

import lesson4_homework.author.Author;
import lesson4_homework.author.InputAuthor;
import lesson4_homework.book.Book;

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
        //Book book1 = valueOf(inputBook1);
        Book book1 = valueOfForHandWrittenBook(inputBook1);

        InputBook inputBook2 = new InputBook();
        inputBook2.setName("Lubovnik Smerti");
        inputBook2.setBookBornYear(1999);
        Book book2 = valueOfForHandWrittenBook(inputBook2);

        InputAuthor inputAuthor = new InputAuthor();
        inputAuthor.setFamilyName("Akunin");
        inputAuthor.setDateOfBorn(1965);
        Author author = valueOfForHandWrittenBook(inputAuthor);
        author.setStorageBooks(new Book[]{book1,book1});

        book1.setBookAuthors(new Author[]{author});
        book2.setBookAuthors(new Author[]{author});
        library.addBook(book1);
        library.addBook(book2);
        library.addBookAuthor(author);

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

    private static Book valueOfForHandWrittenBook(InputBook inputBook) {
        HandWrittenBook book = new HandWrittenBook();
        book.setBookName(inputBook.getName());
        book.setBookBornYear(inputBook.getBookBornYear());
        book.setPaint(inputBook.getPaint());
        return book;
    }

    private static Book valueOfPrintedBook(InputBook inputBook) {
        PrintedBook book = new PrintedBook();
        book.setBookName(inputBook.getName());
        book.setBookBornYear(inputBook.getBookBornYear());
        book.setFontFamily(inputBook.getFontFamily());
        return book;
    }

    private static Author valueOfForHandWrittenBook(InputAuthor inputAuthor) {
        Author author = new Author(null);
        author.setFamilyName(inputAuthor.getFamilyName());
        return author;
    }

}
