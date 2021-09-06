import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Fraction implements Comparable{
    private List<Deputy> deputies = new ArrayList<>();


    public Fraction() {
    }

    public Fraction(ArrayList<Deputy> arrayList) {
        this.deputies = arrayList;
    }

    public ArrayList<Deputy> getDeputies() {
        return (ArrayList<Deputy>) deputies;
    }

    public ArrayList<Deputy> getArrayList() {
        return (ArrayList<Deputy>) deputies;
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

    public void theMostGreedyDeputy(){
            deputies.sort((o1, o2) -> o1.getBribeSize() - o2.getBribeSize());
            Deputy a = deputies.get(deputies.size() - 1);
        System.out.println(a);
    }


    public void getAllDeputy(){
        deputies.getClass();
        System.out.println(deputies);
    }

    public void delAllDeputy(){
        deputies.clear();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

//    public void averegeBribe(Deputy deputy){
//       if (deputy.isGreedy()){
//           getDeputies().
//       }




//        System.out.println();
//    }

// TODO: 04.09.2021  вивести загальну суму хабарів для фракції

}
