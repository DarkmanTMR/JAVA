package second;

public class Drum implements Instrument{
    private int size;

    public Drum() {
    }

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }
    public void play(){
        System.out.println("now paying drum with size " + getSize() + " centimeters");
    }
}
