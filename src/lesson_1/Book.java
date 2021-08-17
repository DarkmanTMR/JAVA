package lesson_1;

public class Book{
    private String name;
    private int pages;
    private String genre;
    private int year;

    public Book(String name, int pages, String genre, int year) {
        this.name = name;
        this.pages = pages;
        this.genre = genre;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}