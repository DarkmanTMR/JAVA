import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    Skills VasyaSkills = new Skills(Title.js, 10);
    Car VasyaCar = new Car("toyota",2021, 250);
    Car rentCar1 = new Car("volvo",2010,150);
    Car rentCar2 = new Car("bmw",2015,300);
    Car rentCar3 = new Car("mini",2016,120);
    Car rentCar4 = new Car("renault",2016,140);

//    HashSet<User> userHashSet = new HashSet<>();
//        userHashSet.add (new User(1,"Vasya","pupkin","asd@asd.com",31,Gender.MALE,VasyaSkills, VasyaCar));
//        userHashSet.add (new User(2,"Leah","Smith","asd@asd.com",25,Gender.FEMALE,VasyaSkills, "Smart", 2015,100));
//        userHashSet.add (new User(3,"Ron","Listens","lalal@mail.com",20,Gender.MALE,Title.js,9,"renault",2005,150));
//        userHashSet.add (new User(4,"Sam","Fisher","asd@asd.com",28,Gender.MALE,VasyaSkills, rentCar4));
//        userHashSet.add (new User(5,"Richard","Green","asd@asd.com",26,Gender.MALE,Title.java, 10, rentCar1));
//        userHashSet.add (new User(6,"Sarah","Dorn","asd@asd.com",31,Gender.FEMALE,Title.js, 7, "porsche", 2010, 250));
//        userHashSet.add (new User(7,"Dilan","Ferbs","asd@asd.com",20,Gender.MALE,VasyaSkills, "Lancia Delta S4", 1984, 260));
//        userHashSet.add (new User(8,"Monica","Diaz","asd@asd.com",23,Gender.FEMALE,Title.java,9, rentCar3));
//        userHashSet.add (new User(9,"Will","Smith","asd@asd.com",27,Gender.MALE,VasyaSkills, "Audi", 2013,300));
//        userHashSet.add (new User(10,"Lisa","Kardridge","asd@asd.com",18,Gender.FEMALE,Title.js, 8, rentCar2));
//        System.out.println(userHashSet);
//
//        Iterator<User> iterator = userHashSet.iterator();
//        while (iterator.hasNext()){
//            User next = iterator.next();
//            if (next.getGender() == Gender.MALE){
//                iterator.remove();
//            }
//        }
//        System.out.println(userHashSet);



    TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add (new User(1,"Vasya","pupkin","asd@asd.com",31,Gender.MALE,VasyaSkills, VasyaCar));
        userTreeSet.add (new User(2,"Leah","Smith","asd@asd.com",25,Gender.FEMALE,VasyaSkills, "Smart", 2015,100));
        userTreeSet.add (new User(3,"Ron","Listens","lalal@mail.com",20,Gender.MALE,Title.js,9,"renault",2005,150));
        userTreeSet.add (new User(4,"Sam","Fisher","asd@asd.com",28,Gender.MALE,VasyaSkills, rentCar4));
        userTreeSet.add (new User(5,"Richard","Green","asd@asd.com",26,Gender.MALE,Title.java, 5, rentCar1));
        userTreeSet.add (new User(6,"Sarah","Dorn","asd@asd.com",31,Gender.FEMALE,Title.js, 7, "porsche", 2010, 250));
        userTreeSet.add (new User(7,"Dilan","Ferbs","asd@asd.com",20,Gender.MALE,VasyaSkills, "Lancia Delta S4", 1984, 260));
        userTreeSet.add (new User(8,"Monica","Diaz","asd@asd.com",23,Gender.FEMALE,Title.c,6, rentCar3));
        userTreeSet.add (new User(9,"Will","Smith","asd@asd.com",27,Gender.MALE,Title.js, 3, "Audi", 2013,300));
        userTreeSet.add (new User(10,"Lisa","Kardridge","asd@asd.com",18,Gender.FEMALE,Title.js, 8, rentCar2));
       System.out.println(userTreeSet);














    }
}
