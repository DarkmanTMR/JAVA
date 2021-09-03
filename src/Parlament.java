import java.util.HashMap;
import java.util.Map;


public class Parlament {
    private Map<String, Fraction> fraction = new HashMap<>();

    public Parlament() {
    }

    public Map<String, Fraction> getFraction() {
        return fraction;
    }

    public void setFraction(Map<String, Fraction> fraction) {
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

    public void addFraction(){

    }

//todo клас Верховна рада
//            поля
//    мапа фракцій
//    методи
//    додати/видалити фракцію
//    вивести всі фракції
//    вивести конкретну фракцію
//    додати/видалити депутата з фракції
//    вивести всіх хабарників фракції
//    вивести найбільшого хабарника у фрації
//    вивести найбільшого хабарника верховної ради
//    вивести фсіх депутатів фракції
//    вивести найбільшого хабарника фракції
//


}
