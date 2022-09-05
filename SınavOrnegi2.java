package algoritma15;

public class SınavOrnegi2 {

    // matris [][] 
    //        |
    //ilk kutucuk satır ikinci kutucuk sütun
    //iki boyutlu matrisin birim matris olup olmadığını bulan programı yazınız
    public static void main(String[] args) {

        int matris[][] = {{1, 0},{0, 1}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    if (matris[i][j] != 1) 
                        System.out.println("birim değildir");     
                    System.exit(0);
                } else {
                    if (matris[i][j] != 0) {
                        System.out.println("birim değildir");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("girilen matris birim matristir");
    }
}
