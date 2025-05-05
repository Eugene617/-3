//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.print("Введите число степени: ");
        int w = scanner.nextInt();
        String numStr = Integer.toString(num);
        int sum = 0;
        int Power = w;
        for(int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            sum += Math.pow(digit, Power);
            Power++;
        }
        if(sum % num == 0) {
            System.out.println(sum + " = " + num + " * " + (sum/num));
        } else {
            System.out.println("Неверно");
        }
    }
}