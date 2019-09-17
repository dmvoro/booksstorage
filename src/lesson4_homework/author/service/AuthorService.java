package lesson4_homework.author.service;

import lesson4_homework.author.domain.Author;

public interface AuthorService {
    int count();
    void print();
    void delete(Author author);
    Long add(Author author);
    void deleteBookWhichOldAndSentReport();
}
