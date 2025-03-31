
public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 1;
        int beg = Math.min(num1,num2);
        int end = Math.max(num1,num2);
        int step = beg;
        System.out.print("Решение: ");
        for (int i = beg; i <= end; i += step) {
            System.out.print(i * i);
            if (i + step <= end)
            System.out.print(", "); {
            }
        }
    }
}