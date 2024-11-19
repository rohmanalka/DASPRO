import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y==0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        for (int i = 1; i <= pangkat; i++) {
            System.out.print(bilangan);
            if (i < pangkat) {
                System.out.print("x");
            } else {
                System.out.print("x1");
            }
        }
        sc.close();
        System.out.println("=" + hitungPangkat(bilangan, pangkat));
    }
}
