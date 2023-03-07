package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int n=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử arr["+i+"]= ");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println("Số lớn nhất trong mảng arr là "+min);
    }
}
