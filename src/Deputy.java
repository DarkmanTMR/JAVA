public class Deputy extends Human{
   private  String name;
   private  String surname;
   private  int age;
   private  boolean greedy;
   private int bribeSize;

    public Deputy() {
    }

    public Deputy(String name, String surname, int age, boolean greedy, int bribeSize) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.greedy = greedy;
        this.bribeSize = bribeSize;
    }

    public Deputy(String name, String surname, int age, boolean greedy) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.greedy = greedy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGreedy() {
        return greedy;
    }

    public void setGreedy(boolean greedy) {
        this.greedy = greedy;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", greedy=" + greedy +
                ", bribeSize=" + bribeSize +
                '}';
    }

    public void giveBribe(int bribeSize) {
        if (!greedy){
            System.out.println(getName() + " " + getSurname() + ": Я не хабарник!!!");
        } else if(bribeSize <= getBribeSize()){
            System.out.println(getName() + " " + getSurname() + ": Беру!!!");
        } else {
            System.out.println(getName() + " " + getSurname() + ": Я сумніваюся...");
        }

    }
}
