package com.guna.files;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample1 {
    public static void main(String[] args) throws IOException {

        // instance of the file
        File file = new File("C:\\Users\\2095286\\OneDrive - Cognizant\\Desktop\\Test Folder\\guna.ppt ");
        if (file.exists()) {
            System.out.println(file.delete());
            System.out.println(file.createNewFile() + " :::::::::created a file::::::" + file.getName());

//            System.out.println(file.isHidden());  // false
//            System.out.println(file.canWrite()); // true
//            System.out.println(file.setWritable(true));
            // mkdir()
            //mkdirs()

            // lastModified()
            // isFile()
            // isDirectory()

        }
//        System.out.println(Arrays.toString(file.list()));
//        System.out.println(Arrays.toString(file.listFiles()));
//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());
        System.out.println(file.createNewFile() + " :::::::::created a file::::::" + file.getName());
        }
    }

