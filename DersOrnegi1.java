package algoritma15;

import java.util.Scanner;

public class DersOrnegi1 {

    //klavyeden girilen 20 tane ifade sınıflandırılmak isteniyor. yani girilen harf
    //rakam ve özel karakterler ayrı ayrı tutulacaktır bu işlemi gerçekleştiren program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi[] = new int[20];
        char karakter[] = new char[20];
        String ozel_tus[] = new String[20];

        String s;
        int krk = 0, num = 0, tus = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("bir ifade giriniz: ");
            s = scan.nextLine();

            if ((s.charAt(0) <= 'z' && s.charAt(0) >= 'a') || (s.charAt(0) <= 'Z' && s.charAt(0) >= 'A')) {
                karakter[krk] = s.charAt(0);
                krk++;
            } else if ( s.charAt(i)>= '0' && s.charAt(i) <= '9') {
                    sayi[num]=Integer.parseInt(s);
                    num++;
            }else{
                ozel_tus[tus]=s;
                tus++;
                
            }
                

        }for (int i = 0; i < karakter.length; i++) {
            System.out.println(karakter[i]);
        }
        for (int i = 0; i < ozel_tus.length; i++) {
            System.out.println(ozel_tus[i]);
        }
        for (int i = 0; i < sayi.length; i++) {
            System.out.println(sayi[i]);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    /*--------------------------------------------------------------------
    //klavyeden girilen harfleri harf dizisine atan program 5 elemanlı
    public static void main(String[] args) {
        char dizi[]=new char[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("harf giriniz: ");
            dizi[i]=scan.nextLine().charAt(0);
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }*/
}
