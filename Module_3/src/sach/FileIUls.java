package sach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIUls {
    public final String FileSach="src/CSV/khachhang.csv";
    public void writeFile(String path,String line){
        try {
            FileWriter write=new FileWriter(path,true);
            BufferedWriter bufferedWriter=new BufferedWriter(write);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFile(String pathFile){
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader =new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line =null;
            while ((line= bufferedReader.readLine())!=null){
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return listLine;
    }
}
