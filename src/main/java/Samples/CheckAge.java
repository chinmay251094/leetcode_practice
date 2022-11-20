package Samples;

public class CheckAge {
    public static void main(String[] args) {
        electionDate();
        System.out.println(checkVoteEligiblity("Bhargey", 21));
    }

    static void electionDate() {
        System.out.println("*****Gujarat elections would be held in December 2022*****");
    }

    static String checkVoteEligiblity(String name, int age) {
        if (age >= 18) {
            return "\t\t\t\t" + name + " you can vote ...";
        } else {
            return "\t\t\t" + name + " you cannot vote yet ...";
        }
    }
}
