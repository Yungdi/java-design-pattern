package chain.calc;

public abstract class Calculator {
    private Calculator nextCalculator;

    public final Calculator setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
        return this;
    }

    public final Integer calculate(final int value) {
        Integer calculatedValue = this.execute(value);
        if (calculatedValue == null)
            return nextCalculator.calculate(value);
        else
            return calculatedValue;
    }

    protected abstract Integer execute(final int value);

}
