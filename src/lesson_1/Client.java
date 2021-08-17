package lesson_1;

import java.util.Arrays;

public class Client{
    private int id;
    private String name;
    private int phone;
    private int post;
    private String[] order;

    public Client() {

    }

    public Client(int id, String name, int phone, int post, String[] order) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.post = post;
        this.order = order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public void setOrder(String[] order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getPost() {
        return post;
    }

    public String[] getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", post=" + post +
                ", order=" + Arrays.toString(order) +
                '}';
    }
}