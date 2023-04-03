package case_study.util;

import case_study.model.Villa;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndReadVilla {
    public static LinkedHashMap<Villa, Integer> readFileToVilla(String pathFile) {
        LinkedHashMap<Villa,Integer>villaIntLinkedHashMap=new LinkedHashMap<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line="";

            while ((line=bufferedReader.readLine())!=null && !line.equals("")){
                String[]text =line.split(",");
                villaIntLinkedHashMap.put(new Villa(text[0],text[1],Float.parseFloat(text[2]),Integer.parseInt(text[3]),
                        Integer.parseInt(text[4]),text[5],text[6],Float.parseFloat(text[7]),Integer.parseInt(text[8])),Integer.parseInt(text[9]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return villaIntLinkedHashMap;
    }

    public static void writeFileToVilla(String pathFile, LinkedHashMap<Villa, Integer> linkedHashMap, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<Villa, Integer>(linkedHashMap) {
            @Override
            public String toString() {
                Iterator<Map.Entry<Villa, Integer>> i = entrySet().iterator();
                if (!i.hasNext())
                    return "{}";

                StringBuilder sb = new StringBuilder();
                for (; ; ) {
                    Map.Entry<Villa, Integer> e = i.next();
                    Villa key = e.getKey();
                    Integer value = e.getValue();
                    sb.append(key == null ? "(this Map)" : key);
                    sb.append(',');
                    sb.append(value == null ? "(this Map)" : value);
                    if (!i.hasNext())
                        return sb.toString();
                    sb.append(',').append('\n');
                }
            }
        };
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(villaIntegerLinkedHashMap));
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
