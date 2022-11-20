package DataFiles;

public class UsePrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Initial page count is "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(7);
        System.out.println("Pages printed are "+pagesPrinted+" and, new total print count for printer is "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed are "+pagesPrinted+" and, new total print count for printer is "+printer.getPagesPrinted());
        int addToner = printer.fillUpToner(20);
        System.out.println(printer.getTonerLevel());
    }
}
