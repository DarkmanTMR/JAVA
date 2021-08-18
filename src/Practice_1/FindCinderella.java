package Practice_1;

public class FindCinderella {
    static void finder(Cinderella[] cinderellas) {
        for (Cinderella cinderella : cinderellas) {
            if (cinderella.getFootSize() == 9.5f) {
                System.out.println(cinderella);
            }
        }
    }
}