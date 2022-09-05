
package algoritma15;

import java.util.Scanner;


public class algoritmaMükemmelSayi {
    //çarpanları toplamı kendine eşit olan sayıya mükemmel sayı denir, klavyeden girilen sayının mükemmel olup olmadığını bulan prog.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        System.out.println("bir sayı giriniz: ");
        int sayi= scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if(sayi%i==0){
                toplam=toplam+i;
            }
        }
        if(toplam == sayi)
            System.out.println("sayı mükemmel sayıdır.");
        else
            System.out.println("mükemmel değil.");
    }
}
