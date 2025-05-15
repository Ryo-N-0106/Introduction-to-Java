import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hãy nhập số nguyên: ");
        int soNguyen = input.nextInt();

        if (soNguyen < 2) {
            System.out.println("Không phải là số nguyên tố!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(soNguyen)) {
                if (soNguyen % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(soNguyen + " là số nguyên tố!");
            else
                System.out.println(soNguyen + " không phải là số nguyên tố!");
        }
    }
}
