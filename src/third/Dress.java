package third;

public class Dress extends Clothes implements WomenClothes{

    private Size size;
    private String color;

    public Dress() {
    }

    public Dress(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Dress(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void dressWoman() {

    }
}
