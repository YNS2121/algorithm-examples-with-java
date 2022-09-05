package algoritma15;

import java.util.Scanner;

public class algoritma3 {

    // klavyeden girilen üç tamsayıyı sıralayan rogramı gerçekleştiriniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int b = scan.nextInt();
        System.out.println("üçüncü sayıyı giriniz: ");
        int c = scan.nextInt();

        if (a >= b) {
            if (b >= c) {
                System.out.println("üç sayının küçükten büyüğe sıralaması: c<b<a");
            } else if (c >= b) {
                System.out.println("üç sayının küçükten büyüğe sıralaması: b<c<a");
            } else if (c > a) {
                System.out.println("üç sayının küçükten büyüğe sıralaması: b<a<c");
            }
        }
        if (b >= a) {
            if (a >= c) {
                System.out.println("üç sayının küçükten büyüğe sıralaması: c<a<b");
            } else if (c >= a) {
                System.out.println("üç sayının küçükten büyüğe sıralaması: a<c<b");
            } else if (c > b) {
                System.out.println("üç sayının küçükten büyüğe sıralaması: a<b<c");

            }
        }

    }
}
