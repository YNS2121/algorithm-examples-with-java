
package algoritma15;

public class SınavOrnegi5 {
    // 1 3 5 7 9 9 11 13 15 17 18 19... serisinin ilk 12 elemanının toplamını bulan program
    public static void main(String[] args) {
        int a,b,c;
        int s3=0;
        int s1=0;
        int s2=0;
        int t=0;
        for (a=1,b=3,c=9; s1+s2+s3<=12;a+=4,b+=4,c+=9) {
            s1++;
            s2++;
            s3++;
            t=t+(a+b+c);
        }
        System.out.println(t);
    }
}
