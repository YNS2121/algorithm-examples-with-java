package algoritma15;

import java.util.Scanner;

public class algoritma4 {

    //klavyeden girilen string içinde "ali" ifadesinin olup olmadığını bulan algoritma.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz: ");
        String kelime = scan.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a' && kelime.charAt(i + 1) == 'l' && kelime.charAt(i + 2) == 'i') {
                System.out.println("kelime ali ifadesi içerir.");
                break;
            } else {
                System.out.println("kelime ali ifadesi içermez.");
            }

        }
    }
}
