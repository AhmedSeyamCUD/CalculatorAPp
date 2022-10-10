import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num1");
        c.setNum1(input.nextDouble());
        System.out.println("enter Second num1");
        c.setNum2(input.nextDouble());
        System.out.println("enter Operator ");
        c.setOperator(input.next().charAt(0));

        double res = c.div(c.getNum1(), c.getNum2());
        System.out.println("the result of div is " + res);

    }

}
