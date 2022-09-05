
package algoritma15;


public class SınavOrnegi4 {
    public static void main(String[] args) {
        //1 3 4 5 5 7 8 9 10 11 12 13 15 15 16... serisinin ilk 40 elemanın toplamını bulan progrmam
        int a;
        int b;
        int c;
        int t=0;
        int s1=0;
        int s2=0;
        int s3=0;
        for (a=1,b=4,c=5;s1+s2+s3<=40;a=a+2,b=b+4,c=c+5) {
            s1++;s2++;s3++;
            t=t+(a+b+c);
            
        }
        
        System.out.println(t);
        
    }
}
