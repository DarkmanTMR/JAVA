package third;


import java.util.Arrays;

public class Atelier  {
    Clothes[] clothes;

    public Atelier() {
    }

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }


    public void manChoice(){
       for (Clothes singleClothes : clothes) {
            if(singleClothes instanceof MenClothes){
                System.out.println(singleClothes);
            }
        }

    }

    public void womanChoice(){
        for (Clothes singleClothes : clothes) {
            if(singleClothes instanceof WomenClothes){
                System.out.println(singleClothes);
            }
        }
    }
}
