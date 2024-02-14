package at.codersbay.java.advanced.common.io.example_readFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        String file = "src/main/resources/example_readFile/content.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));

            String output = null;
            while ((output = reader.readLine()) != null) {
                System.out.println(output);
            }
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }
    }
}
