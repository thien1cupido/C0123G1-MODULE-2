package ss3_array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n=Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Phần tử thứ " + (i+1)+"= ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println("\n");
        System.out.print("Nhập x= ");
        int x = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < numbers.length; j++) {
            if (x == numbers[j]) {
                for (int k = j; k < numbers.length - 1; k++) {
                    numbers[k] = numbers[k + 1];
                }
                numbers[numbers.length-1]=0;
                j--;
            }
        }
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
