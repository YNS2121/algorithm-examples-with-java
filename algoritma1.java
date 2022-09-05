package algoritma15;

import java.util.Scanner;

public class algoritma1 {

    //klavyeden girilecek olan 10 tane sayının eşit olup olmadığını bulan program
    public static void main(String[] args) {
        int sayi[] = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("sayı giriniz: ");
        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = scan.nextInt();
        }
        for (int i = 0; i < sayi.length - 1; i++) {
            if (sayi[i] != sayi[i + 1]) {
                System.out.println("sayılar eşit değildir");
                System.exit(0);
            }

        }
        System.out.println("sayılar eşittir.");

    }
}
