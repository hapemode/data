package com.ppx.t;

import java.io.*;

public class t {
    public static void main(String[] args) throws Exception {

        File file1 = new File("C:/afile/Snipaste_2023-05-09_22-26-52.png");
        File to = new File("p.png");

        // 创建输入流对象
        try (FileInputStream fis = new FileInputStream(file1);
             FileOutputStream fos = new FileOutputStream(to)) {

            // 缓冲区大小，可以自定义
            byte[] buffer = new byte[1024];
            int length;

            // 循环读取源文件并写入目标文件
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("文件转存成功！");
            fis.close();
            fos.close();

            boolean delete = to.delete();
            System.out.println("delete = " + delete);

        } catch (IOException e) {
            e.printStackTrace();
        }

//        File sourceFolder = new File("C:/afile");
//        File destFolder = new File("E:/tfile");
//
//        // Get all the files and subdirectories in the source folder
//        File[] files = sourceFolder.listFiles();
//
//        // Loop through all the files and directories
//        for (File file : files) {
//            // If it's a file, copy it to the destination folder
//            if (file.isFile()) {
//                FileInputStream inputStream = new FileInputStream(file);
//                FileOutputStream outputStream = new FileOutputStream(destFolder + "/" + file.getName());
//
//                byte[] buffer = new byte[1024];
//                int length;
//                while ((length = inputStream.read(buffer)) > 0) {
//                    outputStream.write(buffer, 0, length);
//                }
//
//                inputStream.close();
//                outputStream.close();
//            }
//            // If it's a directory, recursively copy all the files inside it
//            else if (file.isDirectory()) {
//                copyDirectory(file, new File(destFolder + "/" + file.getName()));
//            }
//        }
    }

    private static void copyDirectory(File source, File destination) throws IOException {
        if (!destination.exists()) {
            destination.mkdir();
        }

        // Get all the files and subdirectories in the source folder
        File[] files = source.listFiles();

        // Loop through all the files and directories
        for (File file : files) {
            // If it's a file, copy it to the destination folder
            if (file.isFile()) {
                FileInputStream inputStream = new FileInputStream(file);
                FileOutputStream outputStream = new FileOutputStream(destination + "/" + file.getName());

                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }

                inputStream.close();
                outputStream.close();
            }
            // If it's a directory, recursively copy all the files inside it
            else if (file.isDirectory()) {
                copyDirectory(file, new File(destination + "/" + file.getName()));
            }
        }
    }
}
