package ss11_stack_queue.bai_tap.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenHeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số nguyên bất kỳ: ");
        int input =Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack=new Stack<>();
        for (int i = input; i >0 ; i=i/2) {
            if (i%2==0){
                stack.add(0);
            }else {
                stack.add(1);
            }
        }
        int size=stack.size();
        System.out.println("Số "+input+" chuyển sang hệ nhị phân là ");
        for (int i = 0; i <size; i++) {
            System.out.print(stack.pop());
        }
    }
}
