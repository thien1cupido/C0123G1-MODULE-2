package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        final long vnd = 23000;
        long usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp số tiền usd: ");
        usd = scanner.nextLong();
        long quyDoi = usd * vnd;
        System.out.print(+usd + " USD = " + quyDoi + " VNĐ");
    }
}
