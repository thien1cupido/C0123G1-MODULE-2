package ss3_array.bai_tap;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongmangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhâp m:");
        int m=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhâp n:");
        int n=Integer.parseInt(scanner.nextLine());
        float [][]array=new float[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Phần tử array["+i+"]["+j+"]");
                array[i][j]=Float.parseFloat(scanner.nextLine());
            }
        }
        float max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max<array[i][j]){
                    max=array[i][j];
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
    }
}
