import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;

public class FileStatistics {
    public static void main(String[] args) {
        File f = new File("C:\\Object Files\\Question1.txt");
        try {
           BasicFileAttributes b = Files.readAttributes(f.toPath(), BasicFileAttributes.class);
            System.out.println("The path is >>> " + f.getAbsolutePath());
            System.out.println("The file name is >>> "+ f.getName());
            System.out.println("The folder holding the file is >>> " + f.getParent());
            System.out.println("The size of the file is >>> "+ b.size());
            System.out.println("The file was last modified >>> "+ b.lastModifiedTime());
    }
        catch(IOException i)
        {
            System.out.println("IO Exception Caught");
        }


    }
}