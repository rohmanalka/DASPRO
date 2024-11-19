import java.util.Scanner;

public class PemilihanPercobaan121 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input21.nextInt();
        String hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println(angka + " adalah " + hasil);
    }
}