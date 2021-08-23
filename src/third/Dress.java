package third;

public class Dress extends Clothes implements WomenClothes{
    public Dress(Size size, int price, String color) {
        super(size, price, color);
    }



    @Override
    public void dressWoman() {

    }
}
