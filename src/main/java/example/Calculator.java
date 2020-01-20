package example;


public class Calculator {
    private int value1;
    private int value2;


    public Calculator() {
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }


    public int add() {
        return value1 + value2;
    }

    public int subtract() {
        return value1 - value2;
    }

    public int multiply() {
        return value1 * value2;
    }

    public int divide() {
        if (value2 == 0) {
            throw new ArithmeticException("/ by zero");
        } else
            return value1 / value2;
    }

}
