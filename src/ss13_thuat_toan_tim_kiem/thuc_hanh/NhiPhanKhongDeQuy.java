package ss13_thuat_toan_tim_kiem.thuc_hanh;

public class NhiPhanKhongDeQuy {
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 12, 15, 22, 31, 42, 64};
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 31));
        System.out.println(binarySearch(arr, 12));
    }
}
