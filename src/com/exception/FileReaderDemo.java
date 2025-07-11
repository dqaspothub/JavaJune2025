package com.exception;


import java.io.*;

public class FileReaderDemo {
    public static void readFile(String path) throws IOException {
        FileReader fr = new FileReader(path); // may throw IOException
        // do reading...
    }

    public static void main(String[] args) {
        try {
            readFile("data.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
