public class NumericFunction <T extends Number> {
    private T number;

    public NumericFunction(T number) {
        this.number = number;
    }

    public double reciprocal() {
        return 1.0 / number.doubleValue();
    }

    public double fractionalPart() {
        return number.doubleValue() - Math.floor(number.doubleValue());
    }

    public static boolean equal(Number x, Number y) {
        return Math.abs(x.doubleValue()) == Math.abs(y.doubleValue());
    }

}