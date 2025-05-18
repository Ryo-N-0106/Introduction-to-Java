import java.util.Scanner;

public class ReveseMoney {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double money,VND;
        double rateUSD = 25000;
        System.out.printf("Nhập số tiền: ");
        money = input.nextDouble();

        VND = money * rateUSD;
        System.out.printf("VND: %.2f",VND);
    }
}
