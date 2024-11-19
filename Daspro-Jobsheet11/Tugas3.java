import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner k3 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = k3.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i > 1 && i < N && j > 1 && j < N) {
                    // Mencetak spasi untuk bagian tengah berlubang
                    System.out.print("  ");
                } else {
                    // Mencetak nilai N di bagian pinggir
                    System.out.print(N + " ");
                }
            }
            System.out.println();
        }
    }
}
