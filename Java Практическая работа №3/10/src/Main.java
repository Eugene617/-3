import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        int c = r.nextInt(10);
        int d = r.nextInt(10);
        System.out.println("Угадай 4 цифры от 0 до 9!");
        for (int popytka = 1; popytka <= 20; popytka++) {
            System.out.print("Попытка " + popytka + ": ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int w = scanner.nextInt();
            int sovpalo = 0;
            if (x == a) sovpalo++;
            if (y == b) sovpalo++;
            if (z == c) sovpalo++;
            if (w == d) sovpalo++;
            if (sovpalo == 4) {
                System.out.println("Ты выиграл!");
                return;
            }
            System.out.println("Угадано: " + sovpalo);
        }
        System.out.println("Ты проиграл! Код: " + a + " " + b + " " + c + " " + d);
    }
}