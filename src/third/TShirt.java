package third;

public class TShirt extends Clothes implements MenClothes, WomenClothes  {

    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
    }
    public void dressWoman(){

    }

}
