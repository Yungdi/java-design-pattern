package chain;

public class CCalculator extends Calculator {
    @Override
    protected Integer execute(int value) {
        System.out.println("CCalculator value: " + value);
        return value * value;
    }
}
