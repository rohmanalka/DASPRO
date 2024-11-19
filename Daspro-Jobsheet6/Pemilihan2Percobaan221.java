import java.util.Scanner;

public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        
        System.out.print("Masukkan sudut 1: ");
        int sudut1 = input21.nextInt();
        System.out.print("Masukkan sudut 2: ");
        int sudut2 = input21.nextInt();
        System.out.print("Masukkan sudit 3: ");
        int sudut3 = input21.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || sudut3 == 90)
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == sudut2) && (sudut2 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
            System.out.println("Bukan segitiga");

    }
}
