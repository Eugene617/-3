import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> cell = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if (cell.size() < 3) {
                cell.add(num);
            } else {
                int min = Collections.min(cell);
                cell.set(cell.indexOf(min), num);
            }
            System.out.println("Память: " + cell);
        }
    }
}