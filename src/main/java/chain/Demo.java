package chain;

public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new ACalculator()
                .setNextCalculator(new BCalculator())
                .setNextCalculator(new CCalculator());

        System.out.println(calculator.calculate(3));
        System.out.println(calculator.calculate(99));
        System.out.println(calculator.calculate(200));
    }
}
