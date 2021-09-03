import java.util.HashMap;
import java.util.Map;


public class Parlament {
    private Map<Integer, Fraction> fraction = new HashMap<>();

    public Parlament() {
    }

    public HashMap<Integer, Fraction> getFraction() {
        return (HashMap<Integer, Fraction>) fraction;
    }

    public void setFraction(HashMap<Integer, Fraction> fraction) {
        this.fraction = fraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parlament parlament = (Parlament) o;

        return fraction.equals(parlament.fraction);
    }

    @Override
    public String toString() {
        return "Parlament{" +
                "fraction=" + fraction +
                '}';
    }

    @Override
    public int hashCode() {
        return fraction.hashCode();
    }

    public void addFraction(int number, Fraction fraction1) {
        fraction.put(number, fraction1);
    }
    public void removeFraction(int number, Fraction fraction1) {
        fraction.remove(number, fraction1);
    }
    public void showAllFractions(Parlament parlament){

        }

    }


//todo
//    методи
//   вивести всі фракції
//    вивести конкретну фракцію
//    додати/видалити депутата з фракції
//    вивести всіх хабарників фракції
//    вивести найбільшого хабарника у фрації
//    вивести найбільшого хабарника верховної ради
//    вивести фсіх депутатів фракції
//    вивести найбільшого хабарника фракції
//



