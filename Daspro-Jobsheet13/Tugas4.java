import java.util.Scanner;
public class Tugas4 {
    static int hitungFibonanci (int n) {
        if (n<=1) {
            return (n);
        } else {
            return hitungFibonanci(n - 1) + hitungFibonanci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bulan ke: ");
        int n = sc.nextInt();

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke- " +n+ " adalah: " +hitungFibonanci(n));
    }
}
