import java.util.Scanner;

public class ArrayTugas21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlahElemen = input.nextInt();

        int[] array = new int[jumlahElemen];

        // Mengisi array dengan nilai dari pengguna
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Menghitung nilai tertinggi, nilai terendah, dan nilai rata-rata
        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        int total = array[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }

            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }

            total += array[i];
        }

        double rataRata = (double) total / jumlahElemen;

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}