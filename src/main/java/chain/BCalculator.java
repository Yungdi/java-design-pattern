package chain;

public class BCalculator extends Calculator {
    @Override
    protected Integer execute(int value) {
        if (value < 100) {
            System.out.println("BCalculator value: " + value);
            return value * value;
        }
        else
            return null;
    }
}
