import java.util.Scanner;
public class iteratif1 {
    public static int Iteratif (int n) {
        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            hasil += i;
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka:");
        int n = sc.nextInt();
        System.out.println(Iteratif(n));
    }
    
}