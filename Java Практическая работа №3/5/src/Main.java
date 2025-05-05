import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int i = 10; // Можно изменить на любое число от 10 до 100000
        // Вычисляем число Фибоначчи
        BigInteger fib = BigInteger.ZERO;
        BigInteger next = BigInteger.ONE;
        for (int n = 1; n < i; n++) {
            BigInteger temp = fib.add(next);
            fib = next;
            next = temp;
        }
        System.out.println("F(" + i + ") = " + next);
        // Анализ цифр
        String numStr = next.toString();
        int[] counts = new int[10]; // Массив для подсчёта цифр 0-9
        for (char c : numStr.toCharArray()) {
            counts[c - '0']++;
        }
        // Находим самую частую цифру
        int maxCount = 0;
        int digit = 0;
        for (int d = 0; d < 10; d++) {
            if (counts[d] > maxCount) {
                maxCount = counts[d];
                digit = d;
            }
        }
        System.out.println("Цифра " + digit + " встречается " + maxCount + " раз");
    }
}