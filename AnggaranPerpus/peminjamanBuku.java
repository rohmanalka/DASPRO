import java.util.Scanner;

public class peminjamanBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data buku
        String judulBuku = "Java Programming";
        int kodeBuku = 101;
        
        // Data peminjaman
        System.out.print("Masukkan tanggal peminjaman (dd/mm/yyyy): ");
        String tanggalPeminjaman = input.nextLine();
        System.out.print("Masukkan tanggal pengembalian (dd/mm/yyyy): ");
        String tanggalPengembalian = input.nextLine();
        
        // Konversi tanggal ke angka (misalnya, hari, bulan, tahun)
        int hariPeminjaman = Integer.parseInt(tanggalPeminjaman.split("/")[0]);
        int bulanPeminjaman = Integer.parseInt(tanggalPeminjaman.split("/")[1]);
        int tahunPeminjaman = Integer.parseInt(tanggalPeminjaman.split("/")[2]);
        
        int hariPengembalian = Integer.parseInt(tanggalPengembalian.split("/")[0]);
        int bulanPengembalian = Integer.parseInt(tanggalPengembalian.split("/")[1]);
        int tahunPengembalian = Integer.parseInt(tanggalPengembalian.split("/")[2]);
        
        // Menghitung denda jika terlambat pengembalian
        int denda = 0;
        if (tahunPengembalian > tahunPeminjaman || bulanPengembalian > bulanPeminjaman || hariPengembalian > hariPeminjaman) {
            denda = (tahunPengembalian - tahunPeminjaman) * 365 + (bulanPengembalian - bulanPeminjaman) * 30 + (hariPengembalian - hariPeminjaman);
            denda *= 1000; // Denda per hari
        }
        
        // Menampilkan informasi peminjaman dan denda
        System.out.println("\nInformasi Peminjaman Buku:");
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
        System.out.println("Tanggal Pengembalian: " + tanggalPengembalian);
        
        if (denda > 0) {
            System.out.println("Anda terlambat mengembalikan buku.");
            System.out.println("Denda yang harus dibayar: Rp " + denda);
        } else {
            System.out.println("Buku berhasil dikembalikan tepat waktu.");
        }
        
        // Menutup scanner
        input.close();
    }
}