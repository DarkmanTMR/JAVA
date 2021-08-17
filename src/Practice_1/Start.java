package Practice_1;

public class Start {
    public static void main(String[] args) {


        Prince  prince = new Prince("Charming", 25, 9.5f);

        Cinderella[] cinderellas = new Cinderella[10];
        cinderellas [0] = new Cinderella("Kate", 20, 7.5f);
        cinderellas [1] = new Cinderella("Dora", 23, 8.5f);
        cinderellas [2] = new Cinderella("Lana", 22, 6.5f);
        cinderellas [3] = new Cinderella("Michelle", 20, 5f);
        cinderellas [4] = new Cinderella("Sarah", 20, 9.5f);
        cinderellas [5] = new Cinderella("Monica", 25, 6.5f);
        cinderellas [6] = new Cinderella("Camber", 24, 5.7f);
        cinderellas [7] = new Cinderella("Summer", 21, 5.9f);
        cinderellas [8] = new Cinderella("Rachel", 20, 8.53f);
        cinderellas [9] = new Cinderella("Jennifer", 20, 7.75f);

        for (Cinderella cinderella : cinderellas) {
            if (cinderella.getFootSize() == 9.5f){
                System.out.println(cinderella);
            }


        }
    }
}
