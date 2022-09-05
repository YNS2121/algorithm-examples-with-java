package algoritma15;

public class algoritma11 {
    
    

    
    public static void main(String[] args) {
        

        
        
      /*   ∑ x 1 den 2 ye kadar (x+1)^(x+1)!
        int f=1;
        int t=0;
        int us_bulma=1;
        for (int x = 1; x < 3; x++) {
            for (int k = 1; k < (x+1); k++) 
                f*=k;
               for (int m = 1; m < f; m++) 
            us_bulma*=(x+1);
               t+=us_bulma;
               f=1;
               us_bulma=1;
        }
        System.out.println(t);*/
 
            
            
        
        
        

        
        
        
        
        
        //∑ x 1 den 5 e kadar (x+1)!/(x+1)^x işleminin sonucu
        int f=1;
        int us_bulma=1;
        double t=0.0;
        for (int x = 1; x < 6; x++) {
            for (int k = 1 ; k <=(x+1); k++) 
                f=f*(k);
            
            for (int m = 1; m < x; m++) 
                us_bulma*=(x+1);
            
            t=t+(double)f/(double)us_bulma;
            f=1;us_bulma=1;
        }
        System.out.println(t);
        
        
        
        

        
        
        //basamak değerleri kareleri toplamı kendisine eşit olan 3 basamaklı sayıları ekrana yazan program
       /* int yuzler, onlar, birler;
        for (int i = 100; i < 1000; i++) {
            yuzler = i / 100;
            onlar = (i - (yuzler * 100)) / 10;
            birler = i - (yuzler * 100);
            if (Math.sqrt(yuzler) + Math.sqrt(onlar) + Math.sqrt(birler) == i) {
                System.out.println(i);
            }else
                System.out.println("yok");
        }*/
    }
}
