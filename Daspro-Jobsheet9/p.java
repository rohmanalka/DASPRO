import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " lulus ");
            } else  { 
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " tidak lulus");
            }
        }

        int nilaiTertinggi = nilaiAkhir[0];
        int nilaiTerendah = nilaiAkhir[0];
        int total = nilaiAkhir[0];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }
            total += nilaiAkhir[i];
        }

        double rataRata = (double) total / nilaiAkhir.length;
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}