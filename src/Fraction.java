import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Fraction {
    private ArrayList<Deputy> deputies = new ArrayList<>();


    public Fraction() {
    }

    public Fraction(ArrayList<Deputy> arrayList) {
        this.deputies = arrayList;
    }

    public ArrayList<Deputy> getDeputies() {
        return deputies;
    }

    public ArrayList<Deputy> getArrayList() {
        return deputies;
    }

    public void setArrayList(ArrayList<Deputy> arrayList) {
        this.deputies = arrayList;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "arrayList=" + deputies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        return deputies.equals(fraction.deputies);
    }

    @Override
    public int hashCode() {
        return deputies.hashCode();
    }



    public void addDeputy(Deputy deputy){
        deputies.add(deputy);
    }


    public void delDeputy(Deputy deputy){
        deputies.remove(deputy);

    }

    public void delAllGreedyDeputy(Deputy deputy) {
        if (deputy.isGreedy()) {
            delDeputy(deputy);
        }
    }

//    public void theMostGreedyDeputy(Deputy deputy){
//         deputy.;
//    }


    public void getAllDeputy(){
        deputies.getClass();
        System.out.println(deputies);
    }

    public void delAllDeputy(){
        deputies.clear();
    }

//    public void averegeBribeSum(){
//        double sum = 0;
//
//        System.out.println();
//    }



}
