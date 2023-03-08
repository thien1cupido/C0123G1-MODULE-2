package ss2_3_method.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int m=Integer.parseInt(scanner.nextLine());
        float [][]arr=new float[m][m];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               System.out.print("Phần tử của arr["+i+"]["+j+"] là: ");
                arr[i][j]=Float.parseFloat(scanner.nextLine());
            }
        }
        TongMotCotCuaMangHaiChieu.dislayArr(arr);
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==i){
                    sum1+=arr[i][j];
                }
                if (j==m-1-i){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.print("Tổng đường chéo 1: "+sum1);
        System.out.print("\nTổng đường chéo 2: "+sum2);
    }
}
