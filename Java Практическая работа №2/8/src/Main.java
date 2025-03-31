public class Main {
    public static void main(String[] args) {
        var str = "ABccAAr";
        System.out.println(str);
        int upper = (int) str.chars().filter(Character::isUpperCase).count();
        System.out.println(upper > str.length() - upper ?
                str.toUpperCase() : str.toLowerCase());
    }
}