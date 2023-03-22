package ss14_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;

public class TrienKhaiThuatToanSapXepChen {
    public static void main(String[] args) {
        int[] arr = {6, 2, 36, 8, 3, 4, 7, 12};
        System.out.println("Trước khi sắp xếp " + Arrays.toString(arr));
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("Sau lần thứ " + i + "" + Arrays.toString(arr));
        }
    }
}
