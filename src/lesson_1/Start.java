package lesson_1;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {


//        User user = new User(); // public class User
//
//
//        User user2 = new User(2, (byte) 31, "koko", true, 57.5); //from constructor
//
//        user2.setAge((byte) 20);    // Setter
//        user2.setName("Sam");
//        user2.setStatus(false);
//        user2.setWeight(105.5);
//    System.out.println(user2.getAge());
//    System.out.println(user2.getName());
//    System.out.println(user2.getStatus());
//    System.out.println(user2.getWeight());
//    System.out.println(user2);  // good only with toString()


//       System.out.println(user2.getAge());
//        System.out.println(user2);

//    Client client = new Client();

    Client[] clients = new Client [10];
        clients [0]= new Client(1, "Bob", 555433, 74050, new String[]{"bread", "cola"} );
        clients [1 ]= new Client( 2, "Sam", 555687, 68842, new String[]{"soda", "candy"});
        clients [2 ]= new Client( 3, "Tom", 555686, 68843, new String[]{"chery", "water"});
        clients [3 ]= new Client( 4, "Bif", 555685, 68844, new String[]{"soda", "ice cream"});
        clients [4 ]= new Client( 5, "Dave", 555684, 68845, new String[]{"chips", "candy"});
        clients [5 ]= new Client( 6, "Din", 555683, 68846, new String[]{"soda", "bread"});
        clients [6 ]= new Client( 7, "Rob", 555682, 68847, new String[]{"water", "candy"});
        clients [7 ]= new Client( 8, "Rick", 555681, 68848, new String[]{"cheese", "milk"});
        clients [8 ]= new Client( 9, "Morty", 555689, 68849, new String[]{"soda", "candy"});
        clients [9] = new Client( 10, "Floyd", 554876, 68534, new String[]{"cola", "fanta"});

//    Client[] clients = {client1, client2, client3, client4, client5, client6, client7, client8, client9, client10};
//        System.out.println(Arrays.toString(clients));

        for (int i = 0; i < clients.length; i++){
        Client c = clients[i];
             System.out.println(c);

        }
        System.out.println("---------------------------------------------------------------------------");

    Book[] books = new Book [10];
        books [0] = new Book("Java for Dummies", 150, "Programming", 2019);
        books [1] = new Book("The lord of the Rings", 350, "Fantasy", 1954);
        books [2] = new Book("English", 300, "Education", 2019);
        books [3] = new Book("French", 300, "Education", 2015);
        books [4] = new Book("Nice book", 300, "Comedy", 2020);
        books [5] = new Book("One Punch Man", 900, "Manga", 1995);
        books [6] = new Book("The 4-Hour Workweek", 300, "Development", 2005);
        books [7] = new Book("Sapiens", 300, "Development", 2010);
        books [8] = new Book("Thinking, Fast and Slow", 300, "Development", 2016);
        books [9] = new Book("Man's Search for Meaning", 300, "Development", 2001);

        for (Book book : books) {
            System.out.println(book);
            
        }

        System.out.println("--------------------------------------------------------------------------");

        Animal[] animals = new Animal[10];
        animals [0] = new Animal("Spanky", 1, "dog");
        animals [1] = new Animal("Lucy", 2, "cat");
        animals [2] = new Animal("Bobby", 1, "fish");
        animals [3] = new Animal("Bongo", 5, "carrot");
        animals [4] = new Animal("Lisa", 10, "cat");
        animals [5] = new Animal("Pluto", 6, "dog");
        animals [6] = new Animal("Chip", 3, "squirrel");
        animals [7] = new Animal("Tom", 6, "cat");
        animals [8] = new Animal("boop", 1, "fish");
        animals [9] = new Animal("Ratatui", 1, "mouse");

        for (Animal a : animals) {
            System.out.println(a);
        }
    }

}
