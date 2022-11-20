package Samples;

public class digi {
//    //class -- work from office
//    int a = 10;
//    //static -- work from home
//    static int b = 20;
//
//    //class, local and static variables
//    private void add() {
//        //local
//        int a = 2;
//        int b = 2;
//
//        System.out.println("without return "+(a + b));
//    }
//
//    private int sum() {
//        int a = 2;
//        int b = 2;
//
//        return a + b;
//    }
//
//    public static void main(String[] args) {
////        new digi().add();
////        int ans = new digi().sum() + 5;
////        System.out.println("with return "+ans);
//        System.out.println(new digi().a);
//        System.out.println(digi.b);
//    }

    //declaration of class variable
    static String naam = null;

    //function is declared and defined before execution in main
    //value "Ankita" is present in String n
    static void changeName(String n) {
        //definition
        naam = "Bhargey";
        //value allocation right to lef
        System.out.println(naam);
    }

    //execution starts here
    public static void main(String[] args) {
        changeName("Ankita");
    }
}
