import java.util.Scanner;

public class Anggaran {             
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pendapatan,pengeluaran,sisaAnggaran; 

        // Input pendapatan bulanan
        System.out.print("Masukkan pendapatan bulanan: $");
        pendapatan = input.nextDouble();

        // Input pengeluaran bulanan
        System.out.print("Masukkan pengeluaran bulanan: $");
        pengeluaran = input.nextDouble();

        // Menghitung sisa anggaran
        sisaAnggaran = pendapatan - pengeluaran;

        // Menampilkan laporan anggaran
        System.out.println("\nLaporan Anggaran Perpustakaan Bulanan");
        System.out.println("-------------------------------------");
        System.out.println("Pendapatan Bulanan: $" + pendapatan);
        System.out.println("Pengeluaran Bulanan: $" + pengeluaran);
        System.out.println("Sisa Anggaran Bulanan: $" + sisaAnggaran);

        // Menentukan apakah anggaran berlebih atau defisit
        if (sisaAnggaran > 0) {
            System.out.println("Anggaran perpustakaan memiliki sisa.");
        } else if (sisaAnggaran < 0) {
            System.out.println("Anggaran perpustakaan mengalami defisit.");
        } else {
            System.out.println("Anggaran perpustakaan seimbang.");
        }

        input.close();
    }
}