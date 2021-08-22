package second;

public class Tube implements Instrument{
    private int diameter;

    public Tube() {
    }

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diameter=" + diameter +
                '}';
    }

    public void play(){
        System.out.println("now playing tube with diameter of " + getDiameter() + " centimeters");
    }
}
