import java.util.Scanner;

public class HargaBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga,jumlah,JmlHalaman;
        double Diskon, total,bayar,jmlDis;
        String MerkBuku;

        System.out.println("Masukkan merk buku ");
        MerkBuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        JmlHalaman = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan besaran diskon yang didapatkan ");
        Diskon = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*Diskon;
        bayar = total-jmlDis;

        System.out.println("Merk buku yang anda beli adalah " +MerkBuku);
        System.out.println("Jumlah halaman buku anda adalah " +JmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayarkan adalah " +bayar);

    }
}
