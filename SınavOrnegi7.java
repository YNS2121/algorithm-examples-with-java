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
public class SınavOrnegi7 {
    //klavyeden 10 sayı giriliyor bu sayılar içindeki tek sayıların ortalamasını bulan program
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayac=0;
        for (int i = 0; i < 10; i++) {
            int sayi=scan.nextInt();
            if(sayi%2==1){
                toplam=toplam+sayi;
                sayac++;
            }
        }System.out.println(toplam/sayac);
    }
}
