import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

      User user = new User(1,"Bob",20,Gender.MALE);
      User user1 = new User(2,"Roberta",21,Gender.FEMALE);
      User user2 = new User(3,"Diana",25,Gender.FEMALE);
      User user3 = new User(4,"Alberto",23,Gender.MALE);
      User user4 = new User(5,"Alexandra",26,Gender.FEMALE);
      User user5 = new User(6,"Socratt",27,Gender.MALE);
      User user6 = new User(7,"Lisa",29,Gender.FEMALE);
      User user7 = new User(8,"Teodor",30,Gender.MALE);
      User user8 = new User(9,"Pocahontas",31,Gender.FEMALE);
      User user9 = new User(10,"Ion",19,Gender.MALE);

     List<User> userList = new ArrayList<>(10);
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);

//      userList.stream().filter(users -> users.getId() % 2 == 0)
//              .forEach(users -> System.out.println(users));

//      userList.stream().filter(users -> users.getName().length() > 5)
//              .forEach(users -> System.out.println(users));

//      userList.stream().filter(users -> users.getGender().equals(Gender.FEMALE))
//              .forEach(users -> System.out.println(users));


        ArrayList<String> wordList = new ArrayList<String>();
                wordList.add("One");
                wordList.add("Two");
                wordList.add("Three");
                wordList.add("Four");
                wordList.add("Five");
                wordList.add("Six");
                wordList.add("Seven");
                wordList.add("Eight");
                wordList.add("Nine");
                wordList.add("Ten");
                wordList.add("Jupiter");
                wordList.add("Mars");
                wordList.add("Alabama");
                wordList.add("Zero");
                wordList.add("Bee");



               List<String> sortedList =  wordList.stream()
                        .sorted((o1, o2) -> o1.compareTo(o2))
                        .collect(Collectors.toList());
                        System.out.println(sortedList);


        List<String> reversedList =  wordList.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println(reversedList);

        List<String> lengthList = wordList.stream()
                .filter(word -> word.length() < 4)
                .collect(Collectors.toList());
        System.out.println(lengthList);




    }
}
