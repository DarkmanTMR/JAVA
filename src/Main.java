import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      User user = new User(1,20,Gender.MALE);
      User user1 = new User(2,21,Gender.FEMALE);
      User user2 = new User(3,25,Gender.FEMALE);
      User user3 = new User(4,23,Gender.MALE);
      User user4 = new User(5,26,Gender.FEMALE);
      User user5 = new User(6,27,Gender.MALE);
      User user6 = new User(7,29,Gender.FEMALE);
      User user7 = new User(8,30,Gender.MALE);
      User user8 = new User(9,31,Gender.FEMALE);
      User user9 = new User(10,19,Gender.MALE);

      ArrayList<User> userList = new ArrayList<>(10);
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

       userList.stream().filter(user10 -> user10.getId() % 2 != 0);







    }
}
// TODO: 08.09.2021
//  Створити енум Стать.
//  Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
//  Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
//  Свторити  arrayList , та покласти цих юзерів в arayList.
//  - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//  - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//  - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
//  - создать ArrayList со словами на 15-20 элементов.
//  -- отсортировать его по алфавиту в восходящем порядке.
//  -- отсортировать его по алфавиту  в нисходящем порядке.
//  -- отфильтровать слова длиной менее 4х символов
//  Все тоже стримами делаем