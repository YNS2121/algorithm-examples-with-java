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
public class algoritma18 {
    public static void main(String[] args) {
        int[][] tablo = new int[][]{
            {34, 11, -7, 53},
            {254, 8, -65, 4},
            {110, 64, 33, 26}
        };
        int i, j;
        int kucukEleman, buyukEleman, enKucuk, enBuyuk;
        /*tablonun yazdırılması*/
        System.out.println("Dizinin Elemanlari");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }
        /* Her satırdaki en büyük ve en küçük
        * elemanların bulunması*/
       

        /* Her sütundaki en büyük ve en küçük
       elemanın bulunması*/
 /* Ek olarak tablodaki en büyük ve en küçük
       * elemanın bulunması */
        enKucuk = tablo[0][0];
        enBuyuk = tablo[0][0];
        for (j = 0; j <= 3; j++) {
            kucukEleman = tablo[0][0];
            buyukEleman = tablo[0][0];
            for (i = 0; i <= 2; i++) {
                if (tablo[i][j] < kucukEleman) {
                    kucukEleman = tablo[i][j];
                }
                if (tablo[i][j] > buyukEleman) {
                    buyukEleman = tablo[i][j];
                }
                if (tablo[i][j] < enKucuk) {
                    enKucuk = tablo[i][j];
                }
                if (tablo[i][j] > enBuyuk) {
                    enBuyuk = tablo[i][j];
                }
            }
            System.out.println((j + 1) + ". sutundaki en kucuk eleman: " + kucukEleman);
            System.out.println((j + 1) + ". sutundaki en buyuk eleman: " + buyukEleman);
        }
        System.out.println("Tablodaki en kucuk eleman: " + enKucuk);
        System.out.println("Tablodaki en buyuk eleman: " + enBuyuk);
    }

}


