import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng tiền cho vay: ");
        Double money = scanner.nextDouble();

        System.out.println("Tỉ lệ lãi suất theo tháng: ");
        Double laiSuat = scanner.nextDouble();

        System.out.println("Số tháng cho vay: ");
        Double month = scanner.nextDouble();

        Double interestAmount = money * laiSuat / 12 * month;
        System.out.println("Số tiền lãi là: " + interestAmount);

    }
}
