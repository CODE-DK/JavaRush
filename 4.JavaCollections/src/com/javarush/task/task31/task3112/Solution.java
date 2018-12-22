package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        InputStream stream = url.openStream();
        Path tempFile = Files.createTempFile(urlString,".tmp");
        Files.copy(stream, tempFile);
        String fileName = Paths.get(urlString).getFileName().toString();
        Path target = downloadDirectory.resolve(fileName);
        Files.move(tempFile, target);
        return target;
    }
}
