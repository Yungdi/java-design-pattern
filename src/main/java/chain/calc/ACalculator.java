package chain.calc;

public class ACalculator extends Calculator {

    @Override
    protected Integer execute(int value) {
        if (value < 10) {
            System.out.println("ACalculator value: " + value);
            return value * value;
        }
        else
            return null;
    }

}
