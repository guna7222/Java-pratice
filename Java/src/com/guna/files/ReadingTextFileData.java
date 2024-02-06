package com.guna.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingTextFileData {

    // creating a text file
    public File creatingTextFile() {

        File file = new File("C:/Users/2095286/OneDrive - Cognizant/Desktop/Test Folder/ssg.txt");
        try {
            file.createNewFile();
            System.out.println(file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    // Reading .txt file
    public void readingTextFile(ReadingTextFileData readingTextFileData) {
        StringBuffer str = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(readingTextFileData.creatingTextFile());

            int asciiValues;
            while ((asciiValues = fileInputStream.read()) != -1) {
                System.out.print((char) asciiValues);
                char convertion = (char) asciiValues;
                str.append(convertion);
            }
            System.out.println(":::::::: :::::::::");
            System.out.println(str);

            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadingTextFileData readingTextFileData = new ReadingTextFileData();
        readingTextFileData.readingTextFile(readingTextFileData);
    }
}
