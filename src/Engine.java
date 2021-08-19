public class Engine {
    private String model;
    private float volume;
    private int power;

    public Engine() {
    }

    public Engine(String model, float volume, int power) {
        this.model = model;
        this.volume = volume;
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public float getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }



}
