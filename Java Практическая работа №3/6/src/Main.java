//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        boolean s = true;
        while (n > 1) {
            if (n % 2 == 1) {
                n -= 1;
            } else {
                // Если n/2 нечетное, то взять половину
                if ((n / 2) % 2 == 1 || n == 2) {
                    n /= 2;
                } else {
                    n -= 1;
                }
            }
            s = !s;
        }
        System.out.println(s ? "Таня" : "Саша");
    }
}