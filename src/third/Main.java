package third;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TShirt tShirt = new TShirt("green",Size.L);
        Pants pants = new Pants("blue",Size.M);
        Dress dress = new Dress(Size.L,"yellow");
        Tie tie = new Tie("brown", Size.XS);


        Clothes [] clothes = {tShirt,pants,dress,tie};
        Atelier atelier = new Atelier(clothes);
        System.out.println("Man's choice is: ");
        atelier.manChoice();
        System.out.println("___________________________________________________");
        System.out.println("Woman's choice is: ");
        atelier.womanChoice();

    }
}
