package ss17_io_binary_file.bai_tap.bai_2;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Chương trình sao chép");
        System.out.print("Nhập path file cần sao chép:");
        String filePath= scanner.nextLine();
        writeFileBinary(readFileBinary(filePath));

    }
    public static String readFileBinary(String filePath){
        String s="";
        File file=new File(filePath);
        FileInputStream fileInputStream=null;
        try {
            fileInputStream =new FileInputStream(file);
            int i=-1;
            while ((i=fileInputStream.read())!=-1){
                System.out.println(i);
                s+=(char)i;
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
    public static void writeFileBinary(String s){
        File file =new File("src/ss17_io_binary_file/bai_tap/bai_2/file_copy.dat");
        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream=new FileOutputStream(file);
            byte []bytes =s.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                byte b =bytes[i];
                fileOutputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
