package ss3_array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Số phần tử còn trống trong mảng: ");
        int space = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length - space; i++) {
            System.out.print("Phần tử thứ " + (i + 1)+": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int number : arr) {
            System.out.print(number+" ");
        }
        System.out.println("\n");
        System.out.print("Nhập x là số cần chèn: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vị trí cần chèn: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index == -1 && index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào trong mảng");
        } else {
            for (int j = 0; j < arr.length; j++) {
                if (index == j) {
                    for (int k = arr.length - 1; k >= j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = x;
                }
            }
            for (int number : arr) {
                System.out.print(number+" ");
            }
        }
    }
}
