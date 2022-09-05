package algoritma15;

import java.util.Scanner;

public class DersOrnegi2 {

    public static String sembolleriBul(char dizi[]) {
        String s = " ";
        for (int i = 0; i < dizi.length; i++) {
            if (!((dizi[i] >= 'A' && dizi[i] <= 'Z') || (dizi[i] >= 'a' && dizi[i] <= 'z'))) {
                s += dizi[i];
            }
        }

        return s;
    }

    public static void main(String[] args) {
        char dizi1[] = {'A', '*', 'c', '_', 'd', '*'};
        System.out.println(sembolleriBul(dizi1));

        //kendisine parametre olarak gelen char dizisinde harf dışındaki karakterleri toplayıp 
        //string türünde geri dönünen metodu yapınız
        //Klavyeden girilen elemanın dizide olup olmağını bulup varsa indisini ekrana yazan kod:
        /*  int dizi[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi=scan.nextInt();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                System.out.println(i + ".nci indiste bu sayı vardır");
            }
        }*/
    }

    /*3   4 
      33  44
      333 444
          4444    yazma( girilen sayıya göre )
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        
        for (int i = 0; i <= sayi; i++) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(sayi + " ");
                
            }
        }
        
    }*/
}
