import java.util.Scanner;

public class rekrusif1 {
    static int Rekrusif (int n) {
        if (n==0) {
            return(0);
        } else {
            return n + Rekrusif(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka:");
        int n = sc.nextInt();
        System.out.println(Rekrusif(n));
    }
    
}