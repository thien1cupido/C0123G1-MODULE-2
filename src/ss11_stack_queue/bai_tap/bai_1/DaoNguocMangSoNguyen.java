package ss11_stack_queue.bai_tap.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử vào mảng: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            stack.add(arr[i]);
        }
        System.out.println("Mảng chưa được đảo là");
        for (Integer s : arr) {
            System.out.print(s + " ");
        }

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("\nMảng đã được đảo là");
        for (int s : arr) {
            System.out.print(s + " ");
        }
    }
}
