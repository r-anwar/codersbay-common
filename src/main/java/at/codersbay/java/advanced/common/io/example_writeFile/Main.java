package at.codersbay.java.advanced.common.io.example_writeFile;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String file = "out/wroted_file.txt";

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));

            String output = "Hello World!";
            writer.write(output);
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }

    }
}
