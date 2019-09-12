package lesson4_homework;
import static lesson4_homework.Storage.*;

public class Library {
    public void addBookAuthor(Author bookAuthor) {
        Storage.addAuthor(bookAuthor);
    }

    public void addBook(Book book) {
        storageBooks[bookIndex] = book;
        increaseBookIndex();
    }

    public void printBooks() {
        for (int i = 0; i < Storage.storageBooks.length; i++) {

            Book book = storageBooks[i];
            if(book != null) {
                System.out.println(getBookASStr(book));
            }
        }
    }

    private String getBookASStr(Book book) {
        return book.toString();
    }

    public void printAuthors() {
        for (int i = 0; i < bookAuthors.length; i++) {
            Author bookAuthor = bookAuthors[i];
            if (bookAuthor != null) {
                System.out.println(getAuthorASStr(bookAuthor));
            }
        }

    }

    public String getAuthorASStr(Author bookAuthor) {
        return bookAuthor.toString();
    }
}
