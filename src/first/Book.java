package first;

public class Book implements Printable{
    private int pages;
    private String name;
    private int year;

    public Book() {
    }

    public Book(int pages, String name, int year) {
        this.pages = pages;
        this.name = name;
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "first.Book{" +
                "pages=" + pages +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void print(){
            System.out.println("the book" + name + "written at" + year + "year");
    };
}
