package lesson_1;

public class User{
    private int id;
    private byte age;
    private String name;
    private boolean status;
    private double weight;


    public User(){
    }
    public User(int id, byte age, String name, boolean status, double weight){
        this.id = id;
        this.age = age;
        this.name = name;
        this.status = status;
        this.weight = weight;
    }



    public void setId(int id){
        this.id = id;
    }
    public void setAge(byte age){

        this.age = age;
    }
    public void setName(String name){

        this.name = name;
    }
    public void setStatus(boolean status){

        this.status = status;
    }
    public void setWeight(double weight){

        this.weight = weight;
    }

    public int getId(){

        return id;
    }
    public byte getAge(){

        return age;
    }
    public String getName(){

        return name;
    }
    public boolean getStatus(){

        return status;
    }
    public double getWeight(){

        return weight;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", age=" + age +
//                ", name='" + name + '\'' +
//                ", status=" + status +
//                ", weight=" + weight +
//                '}';
//    }

    @Override public String toString() {
        return "User{" +
                " |id: " + id +
                " |age: " + age +
                " |name: " + name +
                " |status: " + status +
                " |weight: " + weight +
                '}';
    }

}