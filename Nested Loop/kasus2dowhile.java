public class kasus2dowhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < 10);
    }
}
