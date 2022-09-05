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
public class algoritma12 {
    /*  ahmet
    a
    hah
    mhahm
    emhahme
    temhahmet
    şeklinde yazma
    */
    public static void main(String[] args) {
        String str="Yaren";
        for (int i = 0; i < str.length(); i++) {
            for (int j =str.length() ; j < str.length(); j--) {
                System.out.println(str+str.charAt(i));
            }
        }
    }
}
