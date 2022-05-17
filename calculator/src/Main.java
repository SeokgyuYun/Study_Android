import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PlusCalculator 더하기 = new PlusCalculator(a, b);
        MinusCalculator 빼기 = new MinusCalculator(a, b);
        DevideCalculator 나누기 = new DevideCalculator(a, b);
        MultipleCalculator 곱하기 = new MultipleCalculator(a, b);
        더하기.Print();
        빼기.Print();
        나누기.Print();
        곱하기.Print();
    }
}
