package third;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TShirt tShirt = new TShirt(Size.L,"green");
        Pants pants = new Pants(Size.M,"blue");
        Dress dress = new Dress(Size.L,"yellow");
        Tie tie = new Tie(Size.XS,"brown" );


        Clothes [] clothes = {tShirt,pants,dress,tie};
        Atelier atelier = new Atelier(clothes);
        System.out.println("Man's choice is: ");
        atelier.manChoice();
        System.out.println("___________________________________________________");
        System.out.println("Woman's choice is: ");
        atelier.womanChoice();

    }
}
