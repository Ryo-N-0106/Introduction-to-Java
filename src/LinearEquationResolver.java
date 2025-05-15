import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bộ giải phương trình tuyến tính");
        System.out.println("Cho một phương trình dạng 'a * x + b = c', vui lòng nhập các hằng số: ");

        System.out.println("a: ");
        double a = input.nextDouble();
        System.out.println("b: ");
        double b = input.nextDouble();
        System.out.println("c: ");
        double c = input.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.println("Phương trình có 1 nghiệm là x");
            } else {
                System.out.println("Phương trình không có nghiệm!");
            }
        }
    }
}
