package com.guna.files;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\2095286\\OneDrive - Cognizant\\Desktop\\Test Folder\\hello.txt");
        //try {
            //System.out.println(file.createNewFile());
            file.delete();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
