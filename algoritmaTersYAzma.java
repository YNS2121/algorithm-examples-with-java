package algoritma15;

import java.util.Scanner;

public class algoritmaTersYAzma {

    //klavyeden girilen stringi tersten yazma
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//klavyeden almak için tanımladık
        System.out.println("Kelime giriniz: ");
        String kelime = scan.nextLine();//klavyeden string aldık
        int uzunluk = kelime.length();// kelimenin uzunluğu
        for (int i = uzunluk - 1; i >= 0; i--) {
            System.out.print(kelime.charAt(i));
        }
    }
}
