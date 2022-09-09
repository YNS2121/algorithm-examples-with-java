
package onemlisınavsoruları.pkgfinal;

import java.util.Scanner;

public class calculater {
  public static void topla(int a,int b){
      System.out.println("sonuc "+ (a+b));
  }
  public static void cıkarma(int a, int b){
      System.out.println("sonuc " + (a-b));
  }
  public static void carpma(int a, int b){
      System.out.println("sonuc "+ (a*b));
  }
   public static void bol(int a, int b){
       if(b==0)
           System.out.println("sıfır ile Bölünemiyor");
      System.out.println("sonuc "+ (a/b));
  }
      public static void usAl(int a, int b){
      System.out.println("sonuc "+ (Math.pow(a, b)));
  }
      public static void modAl(int a, int b){
      System.out.println("sonuc "+ (a%b));
  }
       public static void cevreAlan(int a, int b){
      System.out.println(" Çevre sonuc "+  (2*(a+b)));
      System.out.println("Alan sonuc "+  (a*b));
  }     
      
      
      
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;
        
        String menu = "1- Toplama İşlemi\n" 
                + "2- Çıkarma işlemi\n"
                + "3- çarpma işlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "8- Çıkış Yap";
        
        
     while(true){ 
          System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();
            
            if(select==0){ //girilen sayı 0 ise programdan çıkış yapacak.
                System.out.println("Tekrar Görüşmek Üzere ^^..");
                break;
            }
            System.out.println("Bir sayı giriniz: ");
            int a=scan.nextInt();
            System.out.println("Bir sayı giriniz: ");
            int b=scan.nextInt();
            
            
            switch(select){
                case 1:
                    topla(a,b);
                    break;
                case 2:
                    cıkarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bol(a,b);
                    break;
                case 5:
                    usAl(a,b);
                    break;
                case 6:
                    modAl(a,b);
                    break;
                case 7:
                    cevreAlan(a,b);
                    break;
            }
            
     }
           
        
    }
    
    
}
