package algoritma15;

import java.util.Scanner;

public class algortima20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayac = 1;
        int enb = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int s = sc.nextInt();
            if (s % 2 == 1) {
                if (sayac == 1) {
                    enb = s;
                    sayac = 0;
                } else {
                    if (s > enb) {
                        enb = s;
                    }
                }
            }
        }
        if (sayac == 1) {
            System.out.println("tek sayı girilmemiştir");
        } else {
            System.out.println("girilen en buyuk tek sayı: " + enb);
        }
    }
}
