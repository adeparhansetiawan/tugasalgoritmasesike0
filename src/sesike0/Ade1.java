package sesike0;

public class Ade1 {
    public static void reverse(int n) {
        if (n > 1) {
            System.out.print(n + ", ");
            reverse(n - 1);
        } else if (n == 1) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        reverse(5);
    }
}
