import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();
        System.out.print("Введите направление (left/right): ");
        String direction = scanner.next();
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int originalPos = c - base;
                int newPos;
                if (direction.equalsIgnoreCase("left")) {
                    newPos = (originalPos - shift) % 26;
                    if (newPos < 0) newPos += 26;
                } else {
                    newPos = (originalPos + shift) % 26;
                }
                c = (char)(base + newPos);
            }
            result += c;
        }
        System.out.println("Результат: " + result);
    }
}