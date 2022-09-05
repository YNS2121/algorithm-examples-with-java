package algoritma15;

public class SınavOrnegi3 {
    //verilen iki boyutlu string matrisi içindeki sayıları bulup ekrana yazan programı oluşturunuz

    public static void main(String[] args) {
        String str[][] = {{"yaren1", "veli21"},
                          {"yaren89", "fatma2"}};        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < str[i][j].length(); k++) {
                    if (str[i][j].charAt(k) >= '0' && str[i][j].charAt(k) <= '9') {
                        System.out.print(str[i][j].charAt(k)+" ");
                }
                }
                
            }
           
        }
    }
}
