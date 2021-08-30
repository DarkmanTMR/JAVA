public class Skills {
    private Title title;
    private int exp;

    public Skills() {
    }

    public Skills(Title title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return " title=" + title +
                ", exp=" + exp +
                '}';
    }
}
