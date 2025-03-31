//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int row = 1;
        int step = 2;
        int num = 5;
        System.out.print("Решение: ");
        for (int i = 0; i < num; i++) {
            System.out.print(row + i * step);
            if (i < num - 1)
                System.out.print(", "); {
            }
        }
    }
}