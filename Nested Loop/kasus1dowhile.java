public class kasus1dowhile {
    public static void main(String[] args) {
        int i = 0;
        do{

            int j = 0;
            do{
                System.out.print("*");
                j++;
            } while (j < 4);

            System.out.println();
            i++;
        } while (i < 4);
    }
    
}