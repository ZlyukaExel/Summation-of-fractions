import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write numerator and denominator of the first fraction and then of the second to get their sum: ");
        Fraction frac1 = new Fraction(in.nextInt(), in.nextInt());
        Fraction frac2 = new Fraction(in.nextInt(), in.nextInt());
        System.out.print(frac1 + "  +  " + frac2 + "  =  " + frac1.sumFraction(frac2));
    }
}
