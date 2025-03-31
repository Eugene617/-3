import java.util.*;
public class Main {
    public static void main(String[] args) {
    var str = "abc abc ab abc ab acs acs";
    var result = String.join(" ", new LinkedHashSet<>(Arrays.asList(str.split(" "))));
    System.out.println(result);
    }
}