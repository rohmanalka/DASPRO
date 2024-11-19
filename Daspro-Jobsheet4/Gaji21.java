import java.util.Scanner;

public class Gaji21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;
        int MerkBuku, JmlHalaman;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan nilai gaji ");
        gaji = input.nextInt();
        System.out.println("Masukkan nilai potongan gaji");
        potGaji = input.nextInt();

        TotGaji = (jmlMasuk*gaji) - (JmlTdkMasuk*potGaji);
        System.out.println("Gaji Yang Anda Terima Adalah " + TotGaji);
    }
}
