package third;

public class Tie extends Clothes implements MenClothes{

    private Size size;
    private String color;

    public Tie() {
    }

    public Tie(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Tie(Size size, int price, String color) {
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
        return "Tie{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void dressMan() {

    }

}
