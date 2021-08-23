package third;

public class Dress extends Clothes implements WomenClothes{

    private Size size;
    private String color;

    public Dress(Size size, String color) {
        this.size = size;
        this.color = color;
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
