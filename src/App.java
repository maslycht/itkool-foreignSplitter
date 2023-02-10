import ee.itkool.ForeignSplitter;

public class App {
    public static void main(String[] args) {
        ForeignSplitter foreignSplitter = new MyDoubleForeignSplitter();

        runApp(foreignSplitter);
    }

    public static void runApp(ForeignSplitter foreignSplitter) {
        foreignSplitter.setUsername("John");
        foreignSplitter.greetUser();

        foreignSplitter.retrieveForeignAmount();
        foreignSplitter.retrieveLocalAmount();

        foreignSplitter.calculateExchangeRate();
        System.out.println("The exchange rate is: " + foreignSplitter.getExchangeRate());

        do {
            foreignSplitter.processPartialAmount();
        } while (foreignSplitter.totalAccountedForLessThanTotal());
    }
}