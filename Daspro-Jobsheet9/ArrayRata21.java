import java.util.Scanner;

public class ArrayRata21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = input.nextInt();

        int[] nilaiAkhir = new int[jmlMahasiswa];
        int jmlLulus = 0;
        int jmlTdkLulus = 0;
        int totalNLulus = 0;
        int totalNTdkLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke " +i+ " : ");
            nilaiAkhir[i] = input.nextInt();
        }
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                jmlLulus++;
                totalNLulus += nilaiAkhir[i];
            } else {
                jmlTdkLulus++;
                totalNTdkLulus += nilaiAkhir[i];
            }
        }
        double rataLulus = (double) totalNLulus / jmlLulus;
        double rataTdkLulus = (double) totalNTdkLulus / jmlTdkLulus;

        System.out.println("Rata-rata nilai lulus : "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus : " +rataTdkLulus);
    }
}
