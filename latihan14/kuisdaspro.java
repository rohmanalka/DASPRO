package Praktikum11;
import java.util.Scanner;

public class kuisdaspro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maksMataKuliah = 100;
        
        String[] kodeMataKuliah = new String[maksMataKuliah];
        String[] namaMataKuliah = new String[maksMataKuliah];
        int[] jumlahSKS = new int[maksMataKuliah];
        
        int count = 0;

        char keluar;
        do {
           
            System.out.print("Masukkan Kode Mata Kuliah: ");
            kodeMataKuliah[count] = scanner.next();

            System.out.print("Masukkan Nama Mata Kuliah: ");
            scanner.nextLine(); 
            namaMataKuliah[count] = scanner.nextLine();

            System.out.print("Masukkan Jumlah SKS: ");
            jumlahSKS[count] = scanner.nextInt();

            count++; 

            System.out.print("Keluar Fitur (y/n): ");
            keluar = scanner.next().charAt(0);

        } while (keluar != 'y' && keluar != 'Y' && count < maksMataKuliah);

     
        System.out.printf("=========================================================\n");
        System.out.printf("                     DATA MATA KULIAH    \n");
        System.out.printf("=========================================================\n");
        System.out.printf("=========================================================\n");
        System.out.printf("|No. | Kode Mata Kuliah | Nama Mata Kuliah | Jumlah SKS\n");
        System.out.printf("=========================================================\n");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "\t|" + kodeMataKuliah[i] + "\t\t|" + namaMataKuliah[i] + "\t\t |" + jumlahSKS[i]);

        }
             System.out.printf("=========================================================\n");
        
        scanner.close();
    }
}
