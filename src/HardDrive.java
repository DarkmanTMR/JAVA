public class HardDrive {
    private String producer;
    private int volume;
    private Type type;

    public HardDrive() {
    }

    public HardDrive(String producer, int volume, Type type) {
        this.producer = producer;
        this.volume = volume;
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "producer='" + producer + '\'' +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }
}
