package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileEx {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get("hospital_info_0920.csv"), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
