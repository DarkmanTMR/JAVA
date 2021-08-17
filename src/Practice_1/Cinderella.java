package Practice_1;

public class Cinderella {
    private String name;
    private int age;
    private float footSize;

    public Cinderella(String name, int age, float footSize) {
        this.name = name;
        this.age = age;
        this.footSize = footSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFootSize(float footSize) {
        this.footSize = footSize;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getFootSize() {
        return footSize;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", footSize: " + footSize +
                '}';
    }
}
