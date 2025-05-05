import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                // Считаем сумму цифр первого числа
                int sum1 = 0;
                for (char c : numbers[i].toCharArray()) {
                    sum1 += c - '0';
                }
                // Считаем сумму цифр второго числа
                int sum2 = 0;
                for (char c : numbers[j].toCharArray()) {
                    sum2 += c - '0';
                }
                // Если сумма цифр первого числа больше - меняем местами
                if (sum1 > sum2) {
                    String temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный список:");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
    }
}