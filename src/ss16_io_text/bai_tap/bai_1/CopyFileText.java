package ss16_io_text.bai_tap.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        System.out.println("Chương trình coppy file");
        System.out.print("Nhập đường dẫn mà file cần coppy: ");
        Scanner scanner=new Scanner(System.in);
        String filePath=scanner.nextLine();
        writeToFile(readFromFile(filePath));
    }

    public static List<String> readFromFile(String filePath) {
        List<String> listString = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < listString.size(); i++) {
                    listString.add(String.valueOf(line.charAt(i)));
                }
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listString;
    }

    public static void writeToFile(List<String> arr) {
        try {
            File file = new File("src\\ss16_io_text\\bai_tap\\coppied_text1");
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter wr = new BufferedWriter(writer);
            int count = 0;
            for (String c: arr
                 ) {
                count++;
                System.out.print(c);
                wr.write(c);
                wr.newLine();
            }
            System.out.println("Có "+count+" kí tự");
            wr.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
