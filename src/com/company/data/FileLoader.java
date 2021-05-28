package com.company.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoader {

    public static ArrayList<String> file() {
        ArrayList<String> loadedfile = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String readLine = br.readLine();

            for (int i = 0; readLine != null; i++) {
                loadedfile.add(readLine);
                readLine = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return loadedfile;
    }
}
