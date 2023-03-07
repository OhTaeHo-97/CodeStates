public class Main {
    public static void main(String[] args) {
        System.out.printf("%s\n", convertToString(123)); // 123
        System.out.printf("%s\n", convertToString("hello")); // hello
        System.out.printf("%s\n", convertToString(true)); // true
    }

    static String convertToString(Object o) {
        return String.valueOf(o);
    }
}