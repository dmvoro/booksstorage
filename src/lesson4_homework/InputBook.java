package lesson4_homework;

public class InputBook {
    private String name;
    private int bookBornYear;
    private int amountOfPages;
    private String paint;
    private String fontFamily;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookBornYear() {
        return bookBornYear;
    }

    public void setBookBornYear(int bookBornYear) {
        this.bookBornYear = bookBornYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
}