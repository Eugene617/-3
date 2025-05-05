//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игроков:");
        int n = scanner.nextInt();
        System.out.println("С какого номера начать?");
        int start = scanner.nextInt();
        // Создаем массив игроков (1, 2, 3... n)
        int[] players = new int[n];
        for (int i = 0; i < n; i++) {
            players[i] = i + 1;
        }
        // Массив для выбывших
        int[] out = new int[n];
        int count = 0;
        int current = start - 1;
        int step = 1;
        while (count < n) {
            // Если игрок еще не выбыл
            if (players[current] != 0) {
                // Если это 3-й шаг
                if (step % 3 == 0) {
                    out[count] = players[current];
                    players[current] = 0;
                    count++;
                }
                step++;
            }
            current = (current + 1) % n;
        }
        System.out.println("Порядок выбывания:");
        for (int player : out) {
            System.out.print(player + " ");
        }
    }
}