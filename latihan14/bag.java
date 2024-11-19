import java.util.Scanner;

public class bag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        String username[]= {"ADMIN", "DOSEN", "MAHASISWA"}; 
        String pw[]= {"123", "456", "789"};
        int login, menu;
        String nama, pin, loginCheck= "";
        boolean Logindosen = false, loginadmin = false, loginmahasiswa = false;

        System.out.println("SISTEM AKADEMIK");
        System.out.println("----------------");

        System.out.println("LOGIN SEBAGAI: ");
        System.out.println("1. ADMIN");
        System.out.println("2. DOSEN");
        System.out.println("3. MAHASISWA");
        System.out.println("");
        login = sc.nextInt();
        sc.nextLine();

        if (login == 1) {
            while (true) {
                System.out.println("Masukkan Nama: ");
                nama = sc.nextLine();
                System.out.println("Masukkan Password: ");
                pin = sc.nextLine();
                for (int i = 0; i < pw.length; i++) {
                    if (nama.equals(username[i]) && pin.equals(pw[i])) {
                        System.out.println("");
                        System.out.println("Login Berhasil");
                        loginadmin = true;
                        loginCheck = "y";   
                        break;                    
                    }
                }

                if (loginCheck.equals("y")) {
                    break;
                }
                
                System.out.println("Username atau password invalid silahkan coba lagi");
            }
            
            while (loginadmin) {
                System.out.println("MENU ADMIN");
                System.out.println("-------------");
                System.out.println("1. INPUT DATA MAHASISWA");
                System.out.println("2. INPUT DATA MATA KULIAH");
                System.out.println("3. UPDATE DATA MAHASISWA");
                System.out.println("4. INPUT NILAI");
                System.out.println("5. CETAK KHS");
                System.out.println("6. REKAP NILAI SEMUA MAHASISWA");
                System.out.println("7. PENCARIAN");
                System.out.println("8. LOGOUT");
                menu = sc.nextInt();

            }

        }   else if (login == 2){
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 1; i < username.length; i++) {
                if (username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil");
                    Logindosen = true;
                    break;
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }
            while (Logindosen) {
                System.out.println("MENU DOSEN");
                System.out.println("-------------");
                System.out.println("1. INPUT NILAI");
                System.out.println("2. CETAK KHS MAHASISWA");
                System.out.println("3. PENCARIAN");
                System.out.println("4. LOGOUT");
                menu = sc.nextInt();
            }
        } else if (login == 3) {
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 2; i < username.length; i++) {
                if(username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil");
                    loginmahasiswa = true;
                    break;
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }
            while (loginmahasiswa) {
                System.out.println("MENU MAHASISWA");
                System.out.println("-------------");
                System.out.println("1. INPUT DATA MAHASISWA");
                System.out.println("2. INPUT DATA MATA KULIAH");
                System.out.println("3. INPUT NILAI MAHASISWA");
                System.out.println("4. CETAK KHS");
                System.out.println("5. REKAP NILAI SEMUA MAHASISWA");
                System.out.println("6. PENCARIAN");
                menu = sc.nextInt();

            }
           
        }
    
        String[] namaMahasiswa = {"Bagas Satria YN", "Arimbi Putri H", "Angga Ahmad"};
        String[] nimMahasiswa = {"2341760108", "2341760108", "2341760108"};
        int totalMahasiswa = 10; 

        System.out.println("(Tabel Data Mahasiswa)\n");
        printMahasiswaTable(namaMahasiswa, nimMahasiswa, totalMahasiswa);
 
        System.out.print("Masukkan Nama Mahasiswa: ");
        String newNama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String newNim = sc.nextLine();

        namaMahasiswa[totalMahasiswa] = newNama;
        nimMahasiswa[totalMahasiswa] = newNim;

        totalMahasiswa++;

        System.out.println("\n(Tabel Data Mahasiswa) [updated]\n");
        printMahasiswaTable(namaMahasiswa, nimMahasiswa, totalMahasiswa);

        sc.close();
    }

    private static void printMahasiswaTable(String[] namaMahasiswa, String[] nimMahasiswa, int totalMahasiswa) {
        System.out.println("No.Nama NIM");
        for (int i = 0; i < totalMahasiswa; i++) {
            System.out.println((i + 1) + ".\t" + namaMahasiswa[i] + "\t" + nimMahasiswa[i]);
        }
        System.out.println();
    
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