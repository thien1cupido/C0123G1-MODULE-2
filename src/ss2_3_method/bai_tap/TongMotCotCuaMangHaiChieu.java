package ss2_3_method.bai_tap;

import java.util.Scanner;

public class TongMotCotCuaMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kích thước của phần tử: ");
        int n=Integer.parseInt(scanner.nextLine());
        float [][]arr=new float[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++){
                System.out.print("Phần tử của arr["+i+"]["+j+"]=");
                arr[i][j]=Float.parseFloat(scanner.nextLine());
            }
        }
        dislayArr(arr);
        int sum=0;
        System.out.print("Nhập vị trí cột để tính tổng: ");
        int viTri=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (viTri==j){
                   sum +=arr[i][j];
               }
            }
        }
        System.out.println("Tổng của cột "+viTri+" là "+sum);
    }
    public static void dislayArr(float [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
