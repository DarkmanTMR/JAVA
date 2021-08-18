public class Car {
    private int id;
    private String model;
    private Driver driver;

    public Car() {
    }

    public Car(int id, String model, Driver driver) {
        this.id = id;
        this.model = model;
        this.driver = driver;
    }


    public Car(int id, String model, String name, String surname, int age, String experience) {
        this.id = id;
        this.model = model;
        this.driver = new Driver(name, surname, age, experience);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", driver=" + driver +
                '}';
    }
}
