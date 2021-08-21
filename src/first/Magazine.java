package first;

public class Magazine implements Printable{
    private int pages;
    private String name;

    public Magazine() {
    }

    public Magazine(int pages, String name) {
        this.pages = pages;
        this.name = name;
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

    @Override
    public String toString() {
        return "first.Magazine{" +
                "pages=" + pages +
                ", name='" + name + '\'' +
                '}';
    }

    public void print(){
        System.out.println("first.Magazine" + name + "have" + pages + "pages");
    }
}
