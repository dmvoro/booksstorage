package lesson4_homework;

public class Book {
    private Long bookId;
    private String bookName;
    private int amountOfPages;
    private int bookBornYear;
    private Author[] bookAuthors;

    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId){
        this.bookId = bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public int getAmountOfPages(){
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages){
        this.amountOfPages = amountOfPages;
    }

    public int getBookBornYear(){
        return bookBornYear;
    }

    public void setBookBornYear(int bookBornYear){
        this.bookBornYear = bookBornYear;
    }

    public Author[] getBookAuthors(){
        return bookAuthors;
    }

    public void setBookAuthors(Author[] bookAuthors){
        this.bookAuthors = bookAuthors;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bbokId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookBornYear=" + bookBornYear +
                ", amountOfPages=" + amountOfPages +
                '}';
    }
}


