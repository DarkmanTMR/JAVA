public class CPU {
    private String model;
    private int frequency;
    private int generation;
    private String producer;

    public CPU() {
    }

    public CPU(String model, int frequency, int generation, String producer) {
        this.model = model;
        this.frequency = frequency;
        this.generation = generation;
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getModel() {
        return model;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getGeneration() {
        return generation;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                ", frequency=" + frequency +
                ", generation=" + generation +
                ", producer='" + producer + '\'' +
                '}';
    }
}
