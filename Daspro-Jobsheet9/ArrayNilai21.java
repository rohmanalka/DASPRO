import java.util.Scanner;

public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke " +i+ " : ");
            nilaiAkhir[i] = input.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" +i+ " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" +i+ " tidak lulus!");
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
        System.out.println(nilaiTerendah);
        System.out.println(nilaiTertinggi);
    }
}
