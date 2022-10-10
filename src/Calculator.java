import java.security.PublicKey;

public class Calculator {
    private double num1;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    private double num2;

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        if (num2 > 0) {
            this.num2 = num2;
        } else {
            this.num2 = 1;
        }
    }

    private char operator;

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public Calculator() {
        num1 = 0;
        num2 = 1;

    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
