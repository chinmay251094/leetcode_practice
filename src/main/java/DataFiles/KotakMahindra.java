package DataFiles;

public class KotakMahindra {
    public static void main(String[] args) {
        KotakMahindra kotakMahindra = new KotakMahindra("Steve Smith");
        System.out.println(kotakMahindra.getName());
        System.out.println(kotakMahindra.getEmail());
        System.out.println(kotakMahindra.getCreditLimit());
    }

    String name;
    double creditLimit;
    String email;

    public KotakMahindra() {
        this("Default Name", 0.00, "noreply@kotak.au");
    }

    public KotakMahindra(String name) {
        this(name, 0.00, "ssmith@cricket.au");
    }

    public KotakMahindra(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
