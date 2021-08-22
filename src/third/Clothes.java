package third;

abstract public class Clothes {
    private Size size;
    private int price;
    private String color;

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
