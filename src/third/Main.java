package third;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TShirt tShirt = new TShirt(Size.L,10,"green");
        Pants pants = new Pants(Size.M,15,"blue");
        Dress dress = new Dress(Size.L,5,"yellow");
        Tie tie = new Tie(Size.XS,20,"brown" );


        Clothes [] clothes = {tShirt,pants,dress,tie};
        Atelier atelier = new Atelier(clothes);
        System.out.println("Man's choice is: ");
        atelier.manChoice();
        System.out.println("___________________________________________________");
        System.out.println("Woman's choice is: ");
        atelier.womanChoice();

    }
}
