//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите зашифрованный текст:");
        String text = scanner.nextLine();
        System.out.println("На сколько букв сдвиг? (например, 3):");
        int shift = scanner.nextInt();
        System.out.println("Расшифрованный текст:");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'а' && c <= 'я') {
                c = (char)(c - shift);
                if (c < 'а') {
                    c += 32;
                }
            }
            else if (c >= 'А' && c <= 'Я') {
                c = (char)(c - shift);
                if (c < 'А') {
                    c += 32;
                }
            }
            System.out.print(c);
        }
    }
}