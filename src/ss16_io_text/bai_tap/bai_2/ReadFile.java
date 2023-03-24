package ss16_io_text.bai_tap.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        final String FILE_PATH = "src\\ss16_io_text\\bai_tap\\bai_2\\contry.txt";
        List<String> list=readFileToString(FILE_PATH);
        for (String s: list
             ) {
            System.out.println(s.toString());
        }
    }

    public static List<String> readFileToString(String filePath) {
        List<String> strings = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                String [] strings1=line.split(",");
                strings.add(String.valueOf(new Country(Integer.parseInt(strings1[0]),strings1[1],strings1[2])));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return strings;
    }
}
