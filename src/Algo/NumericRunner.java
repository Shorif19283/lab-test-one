package Algo;
    import java.util.Scanner;

    public class NumericRunner {
        public static void main(String[] args) {
            Numeric numeric = new Numeric();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n = in.nextInt();
            System.out.println("Enter the value of X: ");
            double x = in.nextDouble();
            double answer = numeric.intPower(x,n);
            System.out.println("Answer = "+answer);
        }
}
