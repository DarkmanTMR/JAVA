import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {









        Deputy deputy = new Deputy("Volodya","Zelya", 35,false);
        Deputy deputy1 = new Deputy("Volodya","Zelya", 25,true,200);
        Deputy deputy2 = new Deputy("Volodya","Zelya", 31,false);
        Deputy deputy3 = new Deputy("Volodya","Zelya", 30,true,300);
//        deputy.giveBribe(50);
//
        List<Deputy> strings= new ArrayList<>();
        strings.add(deputy1);
        strings.add(deputy2);
        strings.add(deputy3);

//        System.out.println(strings);

    Fraction fraction = new Fraction();
    fraction.addDeputy(deputy1);
    fraction.addDeputy(deputy2);
    fraction.addDeputy(deputy3);

    System.out.println(fraction);
//    fraction.delDeputy(deputy1);
//        System.out.println(fraction);
//        fraction.delAllDeputy();
        fraction.getAllDeputy();
//        System.out.println(fraction);
    }
}
