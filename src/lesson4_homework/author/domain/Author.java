package lesson4_homework.author.domain;

import lesson4_homework.book.domain.Book;

public class Author {
    private String familyName;
    private String name;
    private int dateOfBorn;
    private Book[] storageBooks;
    private Long author_id;

    public Author(Long author_id){
        this.author_id = author_id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDateOfBorn(){
        return dateOfBorn;
    }

    public void setDateOfBorn(int dateOfBorn){
        this.dateOfBorn = dateOfBorn;
    }

    public Book[] getStorageBooks(){
        return storageBooks;
    }

    public void setStorageBooks(Book[] storageBooks){
        this.storageBooks = storageBooks;
    }

    public Long getAuthor_id(){
        return author_id;
    }

    public void setAuthor_id(Long author_id){
        this.author_id = author_id;
    }


    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBorn=" + dateOfBorn +
                '}';
    }

}






