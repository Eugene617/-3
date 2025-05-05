//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sticks = scanner.nextLong();
        long tanya = 0;
        boolean isTanya = true; // Таня ходит первой
        while (sticks > 0) {
            if (isTanya) {
                // Таня берет 1 палочку
                tanya++;
                sticks--;
            } else {
                // Саша берет максимум
                if (sticks % 2 == 0) {
                    sticks = sticks / 2;
                } else {
                    sticks--;
                }
            }
            // Меняем ход
            isTanya = !isTanya;
        }
        System.out.println(tanya);
    }
}