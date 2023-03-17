package ss11_stack_queue.bai_tap.bai_1;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();
        chuoi = chuoi.replace(" ", "").toLowerCase();
        ArrayList<Character> arrayList = new ArrayList<>();
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < chuoi.length(); i++) {
            arrayDeque.push(chuoi.charAt(i));
            arrayList.add(chuoi.charAt(i));
        }
        boolean flag = false;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            flag = true;
            if (arrayList.get(i) != arrayDeque.pop()) {
                flag = false;
            }
        }
        if (flag) {

            System.out.println("'" + chuoi + "' Là một chuỗi palindrome");
        } else {
            System.out.println("'" + chuoi + "' Không phải một chuỗi palindrome");
        }
    }
}