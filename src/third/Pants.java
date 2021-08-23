package third;

public class Pants extends Clothes implements MenClothes, WomenClothes{

    private Size size;
    private String color;

    public Pants() {
    }

    public Pants(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Pants(Size size, int price, String color) {
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
        return "Pants{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
