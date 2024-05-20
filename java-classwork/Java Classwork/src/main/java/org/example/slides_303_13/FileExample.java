package org.example.slides_303_13;

import java.io.File;

public class FileExample {

    public static void main(String[] args) throws Exception{


        File f = new File(".");
        System.out.println(f.getAbsolutePath());

        File[] files = f.listFiles();

        for (File file : files) {
            System.out.print("     " + file.getAbsolutePath());
            if (file.isDirectory()) {
                System.out.println(" is a directory");
            } else{
                System.out.println(" is a file");
            }
        }
        File file = new File(".\\newfile.txt");
        file.createNewFile();

    }
}
