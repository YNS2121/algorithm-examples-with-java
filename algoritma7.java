package algoritma15;

import java.util.Scanner;

public class algoritma7 {

    //klavyeden girilen 5 adet string içinde ilk karakteri A ve aynı zamanda son karakteri Z olanları ekrana yazan program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("string giriniz: ");
        /*  for (int i = 0; i < 5; i++) {
            String str = scan.nextLine();
            if(str.charAt(0)=='A'&&str.charAt(str.length()-1)=='Z'){
                System.out.println(str);
            }
        }*/
        String str[] = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) == 'A' && str[i].charAt(str[i].length() - 1) == 'Z') {
                System.out.println(str[i]);
            }
        }

    }
}
