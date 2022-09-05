package algoritma15;

import java.util.Scanner;

public class algoritma2 {

    //Klavyeden girilen stringler içinde karakter sayısı 5 ve 5 ten büyük olan stringleri ekrana yazan ve adedi 20 olduğunda duran programı yazınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        String str;
        while (sayac < 20) {
            System.out.println("bir kelime giriniz: ");
            str = scan.nextLine();
            if (str.length() >= 5) {
                sayac++;
                System.out.println("kelimenin karakter sayısı 5 veya 5 ten büyük: " + str);
            }
        }
    }
}
