import java.util.Scanner;

public class DoWhileCuti21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("apakah anda akan mengambil cuti? (y/t) ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti = " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                }
                } else {
                    break;
            }

        } while (jatahCuti > 0);
    }
}