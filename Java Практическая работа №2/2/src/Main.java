//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var name = "аНнА";
        var result = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();
        System.out.println("Привет," + result + "!");
    }
}