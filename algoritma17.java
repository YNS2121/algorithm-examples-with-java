/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma15;

import java.util.Scanner;

/**
 *
 * @author Yaren Nur Solmaz
 */
public class algoritma17 {

    /* Klavyeden rastgele girilen sayılar içerisinde çift olanları ekrana yazan ve bunların ortalamasını bulan
    (9999) girilmişse duran programı yazınız.*/
    public static void main(String[] args) {
        int sayac=0;
        int toplam=0;
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        while(x!=9999){
          if(x%2==0){
              System.out.println("cift sayi="+x);
              toplam=toplam+x;
              sayac++;
          }
          x=scan.nextInt();
        }
        if (sayac>=1) {
            System.out.println(toplam/sayac);
        }else
                System.out.println("girilen sayı9999 veya hiç çift sayı girilmemştir");
    }
}
