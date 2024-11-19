import java.util.Scanner;
public class Tugas3 {
    static boolean cetakPrimaRekursif(int n, int pembagi) {
        if (n <=1) {
            return (false);
        } else if (n % pembagi == 0) {
            return (false);
        } else {
            return (cetakPrimaRekursif(n, pembagi + 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int n = sc.nextInt();

        if (cetakPrimaRekursif(n, 2)) {
            System.out.println(n + "adalah bilangan prima");
        } else {
            System.out.println(n + "bukan bilangan prima");
        }
        sc.close();
    }
}
