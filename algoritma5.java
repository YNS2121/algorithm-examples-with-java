package algoritma15;

import java.util.Scanner;

public class algoritma5 {

    //klavyeden girilen rasgele tamsayılar içinde pozitif tamsayıları bulup ekrana yazan ve bu tamsayıların adedi 5 olduğunda duran program.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        while (sayac < 5) {
            System.out.println("bir sayı giriniz:");
            int sayi = scan.nextInt();
            if (sayi > 0) {
                sayac++;
                System.out.println("bu bir pozitif tam sayıdır: " + sayi);
            }
        }
    }
}
