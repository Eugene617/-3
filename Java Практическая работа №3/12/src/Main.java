//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String[] slova = text.split(" ");
        String rezultat = "";
        for (String slovo : slova) {
            if (slovo.length() > 0) {
                char bukva = slovo.charAt(0);
                String ostalnoe = slovo.substring(1);
                rezultat += ostalnoe + bukva + "ауч ";
            }
        }
        System.out.println(rezultat);
    }
}