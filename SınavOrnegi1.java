package algoritma15;

import java.util.Scanner;

public class SınavOrnegi1 {

    //girilen iki boyutlu matrisin (dizinin)transpozesini bulan ve ekrana yazan program
    public static void main(String[] args) {
        int matris[][] = {{2, 3, 1}, 
                          {4, 5, 1}};
        for (int i = 0; i < 3; i++) {//satır
            System.out.print("|");
            for (int j = 0; j < 2; j++) {//sütun
                System.out.print(matris[j][i]+" ");
               
            }
            System.out.println("|");
            System.out.println();
        }
    }
}
