import java.util.Scanner;

public class KtSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("nhap so: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
            if (N == 1) {
                System.out.println(N + "không phải là số nguyên tố");
            }
            else if (N == 2) {
                System.out.println(N + "là số nguyên tố");
            }
            else if (N % 2 == 0) {
                System.out.println(N + "không phải là số nguyên tố");
            } else {
                boolean isPrime = true;
                for (int j = 3; j < Math.sqrt(N); j++) {
                    if(N % j == 0) {
                        System.out.println(N + "không phải là số nguyên tố");
                        isPrime = false;
                        break;
                    } else {
                        System.out.println(N + "là số nguyên tố");
                    }
                }
            }

        }
    }
