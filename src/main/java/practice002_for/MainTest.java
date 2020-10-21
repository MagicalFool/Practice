package practice002_for;

public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; test(i); ) {

        }
    }

    public static boolean test(int i) {
        System.out.println("hello");
        i++;
        return i < 10;
    }
}
