package algoritma15;

public class algoritma9 {

    // 1,3,7,9,13,15,19,21... şeklinde giden serinin ilk 100 teriminin toplamını bulan program (tek sayıların toplamı oluyor)
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                toplam += i;
            }
        }
        System.out.println(toplam);
    }
}
