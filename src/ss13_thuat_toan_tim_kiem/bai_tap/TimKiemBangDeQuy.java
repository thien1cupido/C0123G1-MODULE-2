package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemBangDeQuy {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (array[mid] < value) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        if (left <= right) {
            return binarySearch(array, left, right, value);
        }
        return -1;
    }

    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        sortASC(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhập giá trị cần tìm trong mảng: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arr, 0, arr.length, x));
    }
}
