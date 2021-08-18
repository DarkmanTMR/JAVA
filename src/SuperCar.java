public class SuperCar {
    private String model;
    private String producer;
    private int year;
    private Engine engine;

    public SuperCar() {
    }

    public SuperCar(String model, String producer, int year, Engine engine) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public void increaseVolume(float num) {
        this.engine.setVolume(this.engine.getVolume() + num);
    }

    public float getCurrentVolume() {
        return (float) this.engine.getVolume();
    }

    public void decreasePower(){
        this.engine.setPower((int) (this.engine.getPower() - (this.engine.getPower() * 0.1)));
    }

    public int getCurrentPower(){
        return this.engine.getPower();
    }
}
