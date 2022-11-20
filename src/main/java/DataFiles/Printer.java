package DataFiles;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int fillUpToner(int addToner) {
        if (addToner > 0 && addToner <= 100) {
            if (this.tonerLevel + addToner > 100) {
                return -1;
            }
            this.tonerLevel = this.tonerLevel + addToner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int addPages) {
        int pagesToPrint = addPages;
        if (this.isDuplexPrinter) {
            pagesToPrint = (addPages / 2) + (addPages % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
