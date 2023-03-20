package ss12_map_tree.bai_tap.bai_2;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đoạn văn bản: ");
        String input = scanner.nextLine();
        input = input.trim().toLowerCase();
        String[] words = input.split("\\s");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String s : words) {
            if (treeMap.containsKey(s)) {
                int count = treeMap.get(s);
                treeMap.put(s, count+1);
            } else {
                treeMap.put(s, 1);
            }
        }
        System.out.println(treeMap);
    }
}

