
package algoritma15;

public class SınavOrnegi6 {
    // toplam sembolü ∑ ile verilen sorunun çzümü sayı 1 den 3 e kadar (x+1)^(x+1)! işleminin sonucu
    public static void main(String[] args) {
        int f=1;
        int us_bulma=1;
        int t=0;
        for (int x = 1; x < 3; x++) {
            for (int i = 1; i < x+1; i++) {
                f=f*i;
                for (int j = 1; j < f; j++) 
                    us_bulma=us_bulma*(x+1);
                t+=us_bulma;
                f=1; us_bulma=1;
                
            }
            System.out.println(t);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  int f=1;
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
        System.out.println(t);*/
    }
}
