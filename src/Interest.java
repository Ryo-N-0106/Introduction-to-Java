import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soThang;
        double tienGui, laiSuat;

        System.out.printf("Hãy nhập số tiền gửi: ");
        tienGui = input.nextDouble();

        while (tienGui < 1000000) {
            System.out.printf("Số tiền không hợp lệ! Hãy nhập lại!\n");
            System.out.printf("Hãy nhập số tiền gửi: ");
            tienGui = input.nextDouble();
        }

        System.out.printf("Lãi xuất tháng: ");
        laiSuat = input.nextDouble();
        System.out.printf("Số tháng: ");
        soThang = input.nextInt();

        double tienLai = tienGui * (laiSuat/100) / 12 * soThang;

        System.out.printf("Tiền lãi là: %f!",tienLai);

    }
}
