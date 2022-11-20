package DataFiles;

public class Scorpio extends Car {
    private int roadServiceMonths;

    public Scorpio(int roadServiceMonths) {
        super("Scorpio", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
