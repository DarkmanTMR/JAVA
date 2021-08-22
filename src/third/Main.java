package third;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TShirt tShirt = new TShirt();
        Pants pants = new Pants();
        Dress dress = new Dress();
        Tie tie = new Tie();


        Clothes [] clothes = {tShirt,pants,dress,tie};
        Atelier atelier = new Atelier(clothes);
        atelier.manChoice();
        System.out.println("___________________________________________________");
        atelier.womanChoice();

    }
}
