import java.util.Scanner;

public class PenilaianAkademik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai matematika: ");
        double nilai_Matematika;
        System.out.print("Masukkan nilai Bahasa Indonesia: ");
        double nilai_BahasaIndonesia;
        System.out.print("Masukkan nilai Bahasa Inggris: ");
        double nilai_BahasaInggris;
        System.out.print("Masukkan nilai PKN: ");
        double nilai_PKN;
        double rata_rata;

        nilai_Matematika = input.nextDouble();
        nilai_BahasaIndonesia = input.nextDouble();
        nilai_BahasaInggris = input.nextDouble();
        nilai_PKN = input.nextDouble();
        rata_rata = nilai_Matematika + nilai_BahasaIndonesia + nilai_BahasaInggris + nilai_PKN / 4;

        System.out.println("Nilai Matematika: " + nilai_Matematika);
        System.out.println("Nilai Bahasa Indonesia: " + nilai_BahasaIndonesia);
        System.out.println("Nilai Bahasa Inggris: " + nilai_BahasaInggris);
        System.out.println("Nilai PKN: " + nilai_PKN);
        System.out.println("Rata rata nilai: " + rata_rata);
    }
}
