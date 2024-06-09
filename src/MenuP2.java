import java.util.Scanner;

public class MenuP2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("* * * * * * *\n" +
                            "* * * * * * *\n" +
                            "* * * * * * *");
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        String x = "";
                        for (int j = 0; j < i; j++) {
                            x += "*";
                        }
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        String x = "";
                        for (int j = 0; j < i; j++) {
                            x += "*";
                        }
                        System.out.println(x);

                    }
                    break;
            }
        }
    }
}
