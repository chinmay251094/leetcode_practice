package DataFiles;

public class Footballers {
    public static void main(String[] args) {
        Footballers fb = new Footballers();
        fb.setName("Cristiano");
        fb.getName();
    }

    String name;
    int kitNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("The name of the footballer is:: "+name);
    }
}
