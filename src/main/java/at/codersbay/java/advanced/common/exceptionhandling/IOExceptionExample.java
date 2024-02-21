package at.codersbay.java.advanced.common.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {


    public static void main(String[] args) {

        File file = new File("/irgend/ein/pfad");

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
        } catch(IOException ioException) {
            // catched
        }
    }
}
