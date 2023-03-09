package ss4_class_and_object.bai_tap;

import java.util.Scanner;

public class StopWatch {
    long startTime, endTime, a, b;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long start() {
        a = System.currentTimeMillis();
        return a;
    }

    public long stop() {
        b = System.currentTimeMillis();
        return b;
    }

    public long getElapsedTime(long a, long b) {
        long c = a - b;
        return c;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        long a = stopWatch.start();
        long b = 0;
        long c = 0;
        System.out.println("Nhập '1' để bắt đầu và tính giờ");
        int nhap1 = scanner.nextInt();
        if (nhap1 == 1) {
            b = stopWatch.stop();
            c = stopWatch.getElapsedTime(b, a);
            System.out.print("Số mili giây: " + c);
        }
    }
}
