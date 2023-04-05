package case_study.util;

public class SortStartBooking {
    public static int[] getNumberStartDay(String s1) {
        String[] a = s1.split("/");
        int[] arr1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int b = Integer.parseInt(a[i]);
            arr1[i] = b;
        }
        return arr1;
    }

    public static int getReturnInt(int[] a, int[] b) {
        int y = a.length - 1;
        if (a[y] - b[y] == 0) {
            if (a[y - 1] - b[y - 1] == 0) {
                if (a[y - 2] - b[y - 2] == 0) {
                    return 0;
                } else if (a[y - 2] - b[y - 2] > 0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (a[y - 1] - b[y - 1] > 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (a[y] - b[y] > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
