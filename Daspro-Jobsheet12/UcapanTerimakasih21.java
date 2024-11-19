import java.util.Scanner;

public class UcapanTerimakasih21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UcapanTerimaKasih(sc);

        sc.close();
    }

    public static String PenerimaUcapan(Scanner sc) {
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(Scanner sc) {
        String nama = PenerimaUcapan(sc);
        System.out.println("Thank you " + nama + " Thank you for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");

        System.out.println("Masukkan ucapan tambahan: ");
        String ucapanTambahan = sc.nextLine();

        UcapanTambahan(ucapanTambahan);
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }
}