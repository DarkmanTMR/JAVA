import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Human> arrayList = new ArrayList<>();
        arrayList.add(new Human(1, "Sam", "Fisher", 18, Gender.MALE));
        arrayList.add(new Human(2, "Bob", "Smith", 17, Gender.MALE));
        arrayList.add(new Human(3, "Ben", "Smith", 26, Gender.MALE));
        arrayList.add(new Human(4, "Dean", "Smith", 19, Gender.MALE));
        arrayList.add(new Human(5, "Sarah", "Smith", 24, Gender.FEMALE));
        arrayList.add(new Human(6, "Lucy", "Smith", 35, Gender.FEMALE));
        arrayList.add(new Human(7, "Barry", "Smith", 40, Gender.MALE));
        arrayList.add(new Human(8, "Leonard", "Smith", 88, Gender.MALE));
        arrayList.add(new Human(9, "Sheldon", "Smith", 45, Gender.MALE));
        arrayList.add(new Human(10, "Raj", "Smith", 26, Gender.MALE));


        Driver driver1 = new Driver("Bob","Smith",25,"big");
        Driver driver2 = new Driver("Donny","Smith",23,"medium");
        Driver driver3 = new Driver("Rick","Smith",21,"small");
        Driver driver4 = new Driver("Sam","Smith",27,"big");
        Driver driver5 = new Driver("Phil","Smith",28,"big");



        Car car1 = new Car(1,"bmw",driver1);
        Car car2 = new Car(2,"toyota",driver2);
        Car car3 = new Car(3,"subaru",driver3);
        Car car4 = new Car(4,"ford",driver4);
        Car car5 = new Car(5,"volvo",driver5);
        Car car6 = new Car(6,"mini","Greg","Smith",29,"small");
        Car car7 = new Car(7,"smart", "Will","Smith",20,"medium");
        Car car8 = new Car(8,"renault","Jack","Smith",22,"medium" );
        Car car9 = new Car(9,"acura", "David","Smith",26,"small");
        Car car10 = new Car(10,"acura", "Matthew","Smith",25,"big");


        Engine engine = new Engine("Ferrari599xx",6.4, 560);
        SuperCar superCar = new SuperCar("bugatti", "Bugatti", 2017, engine);

        superCar.increaseVolume(1.2f);
        System.out.println(superCar.getCurrentVolume());


        superCar.decreasePower();
        System.out.println(superCar.getCurrentPower());






    }
}
