package ss2_loop.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là");
        int soTN = 2;
        while (soTN <= 100) {
            int count = 0;
            for (int i = 1; i <= soTN; i++) {
                if (soTN % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(soTN);
            }
            soTN++;
        }
    }
}