/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma15;

import java.util.Scanner;

/**
 *
 * @author Yaren Nur Solmaz
 */
//girilen sayının negatif veya pozitif olduğunu bulan program
public class Algoritma15 {

  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi=scan.nextInt();
        if(sayi<0){
            System.out.println("sayı negatiftir.");
        }else{
            System.out.println("sayi pozitiftir.");
        }
    }
    
}
