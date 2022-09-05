package algoritma15;

import java.util.Scanner;

public class algoritma8 {

    //klavyeden girilen sayıyı pozitif tam sayı kabul ederek bu sayı ile 1000 sayısı arasındaki asal sayıları bulup ekrana yazan programı yazınız.
    public static void main(String[] args) {
        int sayac = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("başlangıç değerini giriniz:  ");
        int sayi = scan.nextInt();
        for (int i = sayi; i < 1000; sayi++) {
            for (int j = 2; j <= i; j++) {
                if (sayi % j == 0) {
                    sayac++;
                }
            }

        }
        if (sayac == 0) {
            System.out.println("sayı asaldır" + sayi);
        } else {
            System.out.println("sayı asal değildir" + sayi);
        }
    }
}
