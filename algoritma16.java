/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma15;

/**
 *
 * @author Yaren Nur Solmaz
 */
public class algoritma16 {
   public static void main(String[] args) {

        // 1,2,4,4,6,7,8,10,12,13,14,16,16,18,19,20
        //a./ 1,4,8,13,16,20 toplam_a;
        //b./ 2,6,10,14,18
        //c./ 4,7,12,16,19
        int a = -1;
        int toplam_a = 0;

        int b = -1;
        int toplam_b = 0;

        int c = -1;
        int toplam_c = 0;

        int genel_toplam = 0;

        for (int i = 0; i < 6; i++) {
            switch (a) {
                case -1:
                    toplam_a = 1;
                    System.out.println("Toplam_a:" + toplam_a);// toplam_a=1
                    a = a + 1; //a= 2
                    break;
                case 0:
                    toplam_a = toplam_a + 3;
                    System.out.println("Toplam_a:" + toplam_a);//toplam_a=4
                    a = a + 1;//a=3
                    break;
                case 1:
                    toplam_a = toplam_a + 4;
                    System.out.println("Toplam_a:" + toplam_a);
                    a = a + 1;
                    break;
                case 2:
                    toplam_a = toplam_a + 5;
                    System.out.println("Toplam_a:" + toplam_a);
                    a = 0;
                    break;
            }
            genel_toplam += toplam_a;// genel_toplam=5
            System.out.println("--------------------------------");
            if (i < 5) { //a'nın eleman sayısı b ve c'den bir fazla olduğu için son turda b ve c dönmesin diye.
                switch (b) {
                    case -1:
                        toplam_b = 2;
                        System.out.println("Toplam_b:" + toplam_b);
                        b = b + 1;
                        break;
                    case 0:
                        toplam_b = toplam_b + 4;
                        System.out.println("Toplam_b:" + toplam_b);
                        b = b + 1;
                        break;
                    case 1:
                        toplam_b = toplam_b + 4;
                        System.out.println("Toplam_b:" + toplam_b);
                        b = b + 1;
                        break;
                    case 2:
                        toplam_b = toplam_b + 4;
                        System.out.println("Toplam_b:" + toplam_b);
                        b = b + 1;
                        break;
                    case 3:
                        toplam_b = toplam_b + 4;
                        System.out.println("Toplam_b:" + toplam_b);
                        b = 0;
                }

                System.out.println("--------------------------------");

                switch (c) {
                    case -1:
                        toplam_c = 4;
                        System.out.println("Toplam_c:" + toplam_c);
                        c = c + 1;
                        break;
                    case 0:
                        toplam_c = toplam_c + 3;
                        System.out.println("Toplam_c:" + toplam_c);
                        c = c + 1;
                        break;
                    case 1:
                        toplam_c = toplam_c + 5;
                        System.out.println("Toplam_c:" + toplam_c);
                        c = c + 1;
                        break;
                    case 2:
                        toplam_c = toplam_c + 4;
                        System.out.println("Toplam_c:" + toplam_c);
                        c = 0;
                        break;
                }
                genel_toplam = genel_toplam + toplam_b + toplam_c;
            }

        }
        System.out.println("Genel toplam: " + genel_toplam);
    }
}
