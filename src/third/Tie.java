package third;

public class Tie extends Clothes implements MenClothes{

    private String color;
    private Size size;

    public Tie(String color, Size size) {
        this.color = color;
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
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tie{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public void dressMan() {

    }

}
