
package algoritma15;

import java.util.Scanner;

public class algoritma19 {
    //klavyeden girilen 10 tam sayıdan tek olan sayılardan en büyüğünü ekrana yazan program(girilen sayılardan hiçbiri tek olmayabilir)
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int tekdizi[]=new int[10];
        for (int i = 0; i < 10; i++) {
            int sayi=scan.nextInt();
            if (sayi%2!=0) {
                tekdizi[i]=sayi;
            }
        }
        
        int enb=tekdizi[0];
        for (int i = 1; i < 10; i++) {
            if (enb<tekdizi[i]) {
                enb=tekdizi[i];
                
            }
            System.out.println("en buyuk eleman"+tekdizi[i]);
        }
            
    }}
