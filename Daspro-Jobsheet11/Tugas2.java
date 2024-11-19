import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner k2 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = k2.nextInt();

        if (N < 5) {
            System.out.println("Nilai N minimal harus 5.");
            return;
        }

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
