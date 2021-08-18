public class Driver {
    private String name;
    private String surname;
    private int age;
    private String experience;

    public Driver() {
    }

    public Driver(String name, String surname, int age, String experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String isExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
