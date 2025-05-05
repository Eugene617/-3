//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в диапазоне 0 < n < 100000: ");
        int n = scanner.nextInt();
        boolean found = false;
        for (int k = 1; ; k++) {
            int sq1 = k * k;
            int sq2 = (k + 1) * (k + 1);
            int difference = sq2 - sq1;
            if (difference == n) {
                System.out.printf("%d = %d - %d%n", n, sq2, sq1);
                found = true;
                break;
            }
            if (difference > n) {
                break;
            }
        }
        if (!found) {
            System.out.println("Для данного числа не существует подходящей пары квадратов");
        }
    }
}