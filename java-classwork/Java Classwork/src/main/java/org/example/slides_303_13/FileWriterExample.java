package org.example.slides_303_13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {


        try {
            File output = new File("output.txt");

            FileWriter fileWriter = new FileWriter(output, false);

            for (int count = 0; count <10; count ++) {
                fileWriter.write("Line (" + count + ") This is my first sentence writing to a file\n");
            }

            //this tells the FileWriter to save it's internal bugger rn, even if it's not totally full
            fileWriter.flush();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
