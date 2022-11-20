package leetCode;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String print = interpret("(al)G(al)()()G");
        System.out.println(print);
    }

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
