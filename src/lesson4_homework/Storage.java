package lesson4_homework;


import lesson4_homework.author.Author;
import lesson4_homework.book.Book;

public class Storage {
    public static final int CAPACITY = 10;
    public static Book[] storageBooks = new Book[CAPACITY];
    public static int bookIndex = 0;

    public static void increaseBookIndex(){
        bookIndex++;
    }

    public static Author[] bookAuthors = new Author[CAPACITY];
    public static int authorIndex = 0;

    public static void increaseAuthorIndex(){
        authorIndex = authorIndex + 1;
    }

    public static void increaseAuthorsStorage() {
        Author[] authors = new Author[authorIndex + CAPACITY];
        for(int i = 0; i < Storage.bookAuthors.length; i++){
            authors[i] = Storage.bookAuthors[i];
        }

        Storage.bookAuthors = authors;
    }

    public static void addAuthor(Author bookAuthor){
        bookAuthor.setAuthor_id(System.currentTimeMillis());

        if(authorIndex % (CAPACITY) == 0 && authorIndex != 0){
            increaseAuthorsStorage();
        } else {
            bookAuthors[authorIndex] = bookAuthor;
        }

        Storage.increaseAuthorIndex();

    }
}
