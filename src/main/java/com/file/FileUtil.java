package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileUtil {
    public static void readFile(String filePath) {
        try(FileReader fr = new FileReader(new File(filePath))) {
            fr.read();
        } catch (Throwable e) {
            e.printStackTrace();
        }

      //  FileReader fr = new FileReader();
    }
    public static String writeFile(String content) {
        String fileName = "test.txt";
        try(FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(content);
            fw.flush();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return fileName;
    }
    public static void main(String[] args){
        String fullPath = writeFile("test hello world");
        readFile(fullPath);
    }
}
