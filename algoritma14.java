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
public class algoritma14 {
   
    public static void main(String[] args) {
        //iç içe ∑1 den 3 e ∑2 den 4 e (x+y) işlemi
          int carpım=1; int toplam=0;
        for (int x = 1; x <= 3; x++) {
            for (int y = 2; y <=4; y++) {
                carpım=carpım*(x+y);
            }System.out.println(carpım);
            
            
        }
        System.out.println(toplam);
    }
}
