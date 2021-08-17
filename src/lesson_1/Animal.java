package lesson_1;

public  class Animal{
    private String nickname;
    private int age;
    private String type;

    public Animal(String nickname, int age, String type) {
        this.nickname = nickname;
        this.age = age;
        this.type = type;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}