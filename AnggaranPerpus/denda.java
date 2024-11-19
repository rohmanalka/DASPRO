import java.util.Scanner;

public class denda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan tanggal kembali buku dalam format DD MM YYYY
        System.out.print("Masukkan tanggal pengembalian (DD MM YYYY): ");
        int hariPengembalian = input.nextInt();
        int bulanPengembalian = input.nextInt();
        int tahunPengembalian = input.nextInt();

        // Masukkan tanggal jatuh tempo buku dalam format DD MM YYYY
        System.out.print("Masukkan tanggal jatuh tempo (DD MM YYYY): ");
        int hariJatuhTempo = input.nextInt();
        int bulanJatuhTempo = input.nextInt();
        int tahunJatuhTempo = input.nextInt();

        // Hitung denda
        int denda = 0;

        if (tahunPengembalian > tahunJatuhTempo || (tahunPengembalian == tahunJatuhTempo && bulanPengembalian > bulanJatuhTempo) ||
                (tahunPengembalian == tahunJatuhTempo && bulanPengembalian == bulanJatuhTempo && hariPengembalian > hariJatuhTempo)) {
            // Pengembalian terlambat
            int daysLate = returnDay - dueDay;
            int monthsLate = returnMonth - dueMonth;
            int yearsLate = returnYear - dueYear;

            denda = yearsLate * 365 + monthsLate * 30 + daysLate;
            System.out.println("Anda terlambat mengembalikan buku selama " + denda + " hari.");
        } else {
            System.out.println("Anda mengembalikan buku tepat waktu.");
        }

        // Hitung jumlah denda berdasarkan aturan tertentu
        if (denda > 0) {
            int dendaTotal = denda * 1000; // Misalnya, denda per hari adalah 1000 rupiah
            System.out.println("Denda yang harus dibayar: " + dendaTotal + " rupiah.");
        } else {
            System.out.println("Tidak ada denda yang harus dibayar.");
        }

        input.close();
    }
}
