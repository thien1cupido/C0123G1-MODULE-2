package ss14_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;

public class CaiDatThuatToanSapSepChen {
    public static void insertionSort(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 6, 8};
        insertionSort(array);
    }
}
