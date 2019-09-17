package lesson4_homework;

import lesson4_homework.book.domain.Book;

public class HandWrittenBook extends Book {
    private String paint;

    public String getPaint() {
        return paint;
    }

    public void setPaint (String paint) {
        this.paint = paint;
    }
}
