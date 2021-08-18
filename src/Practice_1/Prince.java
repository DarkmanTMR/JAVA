package Practice_1;

public class Prince {
    private String name;
    private int age;
    private float foundedShoe;

    public Prince() {
    }

    public Prince(String name, int age, float foundedShoe) {
        this.name = name;
        this.age = age;
        this.foundedShoe = foundedShoe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFoundedShoe(float foundedShoe) {
        this.foundedShoe = foundedShoe;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getFoundedShoe() {
        return foundedShoe;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", foundedShoe: " + foundedShoe +
                '}';
    }
}
