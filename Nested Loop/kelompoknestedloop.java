public class kelompoknestedloop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Cetak spasi untuk membuat celah di sebelah kanan
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Cetak bintang
            System.out.println("*");
        }
    }
}
