package ss3_array.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        int[] arr3=new int[arr1.length+arr2.length];
        System.out.println("Nhập phần tử của mảng 1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Phần tử thứ "+(i+1)+" của mảng arr1: ");
            arr1[i]=Integer.parseInt(scanner.nextLine());
            arr3[i]=arr1[i];
        }
        System.out.println("Nhập phần tử của mảng 2");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Phần tử thứ "+(j+1)+" của mảng arr2: ");
            arr2[j]=Integer.parseInt(scanner.nextLine());
            arr3[arr2.length+j]=arr2[j];
        }
        System.out.println("Phần tử mảng 1");
        for (int number:arr1) {
            System.out.print(number+" ");
        }
        System.out.println("\n");
        System.out.println("Phần tử mảng 2");
        for (int number:arr2) {
            System.out.print(number+" ");
        }
        System.out.println("\n");
        System.out.println("Phần tử mảng 3");
        for (int number:arr3){
            System.out.print(number+" ");
        }
    }
}
