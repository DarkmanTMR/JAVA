public class Ram {
    int volume;
    String producer;
    String model;
    int frequency;

    public Ram() {
    }

    public Ram(int volume, String producer, String model, int frequency) {
        this.volume = volume;
        this.producer = producer;
        this.model = model;
        this.frequency = frequency;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "volume=" + volume +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
