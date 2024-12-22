package sesike0;

import java.util.Scanner;

public class Ade2 {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            System.out.println(str + " adalah palindrome");
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            System.out.println(str + " bukan palindrome");
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String str = sc.next();

        isPalindrome(str, 0, str.length() - 1);

        sc.close();
    }
}
