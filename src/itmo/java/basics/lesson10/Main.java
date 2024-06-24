package itmo.java.basics.lesson10;

import java.io.*;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        File file2 = new File("files/output.txt");


//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//
//            String input;
//            while ((input = reader.readLine()) != null) {
//                System.out.println(input);
//            }
//
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

//        InputStream is = null;
//        OutputStream os = null;
//
//        try {
//            is = new FileInputStream(file);
//            os = new FileOutputStream(file2);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        } finally {
//
//            try {
//                if (is != null) {
//                    is.close();
//                }
//
//                if (os != null) {
//                    os.close();
//                }
//
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }

//        writeData(List.of("Java", "Programming", "Language"), file, "files/output.txt");


        Path path = Paths.get("C:\\Users\\user\\Downloads");

        File[] files = path.toFile().listFiles();
//        if (files !=null) {
//            for (File file1 : files) {
//                System.out.println(file1.getName());
//            }
//        }

//        double totalSpace = path.toFile().getTotalSpace() / 1_000_000_000.0;
//        String space = new DecimalFormat("#.##").format(totalSpace) + "GB";
//        System.out.println(space);

//        double freeSpaceDisk = path.toFile().getFreeSpace() / 1_000_000_000.0;
//        String freeSpace = new DecimalFormat("#.##").format(freeSpaceDisk) + "GB";
//        System.out.println(freeSpace);

//        System.out.println(path.getFileSystem());


//        try {
//            Files.readAllBytes(Paths.get("C:\\Users\\user\\Downloads"))
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        FileSystem fs = FileSystems.getDefault();         // get disk file system
//        for (FileStore store : fs.getFileStores()) {
//            String type = store.type();
//            System.out.println("FileStore type: " + type);
//        }

    }


    public static void writeData(List<String> strings, File file, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            String input;
            while ((input = reader.readLine()) != null) {
                 for (String string : strings) {
                     writer.write(string + input + "\n");
                 }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
