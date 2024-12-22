package sesike0;

public class Ade4 {
    public static int findMax(int[] arr) {
        int max = arr[0]; // Inisialisasi max dengan elemen pertama array

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max jika menemukan nilai yang lebih besar
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 7, 4, 9, 0, 5, 8, 4, 13, 12, 15 };
        int result = findMax(arr);
        System.out.println("Nilai tertinggi = " + result);
    }
}
