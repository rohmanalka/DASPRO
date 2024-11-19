import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Pertanyaan 1
        System.out.println("Pertanyaan 1: Apa ibu kota Indonesia?");
        System.out.println("A) Jakarta");
        System.out.println("B) Surabaya");
        System.out.println("C) Bandung");
        String jawaban1 = scanner.nextLine();
        if (jawaban1.equalsIgnoreCase("A")) {
            System.out.println("Jawaban benar!");
            score++;
        } else {
            System.out.println("Jawaban salah. Jawaban yang benar adalah A) Jakarta.");
        }
        
        // Pertanyaan 2
        System.out.println("Pertanyaan 2: Berapa banyak benua di dunia?");
        System.out.println("A) 5");
        System.out.println("B) 6");
        System.out.println("C) 7");
        String jawaban2 = scanner.nextLine();
        if (jawaban2.equalsIgnoreCase("C")) {
            System.out.println("Jawaban benar!");
            score++;
        } else {
            System.out.println("Jawaban salah. Jawaban yang benar adalah C) 7.");
        }
        
        // Hitung dan tampilkan skor akhir
        System.out.println("Skor akhir: " + score + "/2");
        
        // Tutup scanner
        scanner.close();
    }
}
