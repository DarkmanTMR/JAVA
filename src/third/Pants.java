package third;

public class Pants extends Clothes implements MenClothes, WomenClothes{


    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
