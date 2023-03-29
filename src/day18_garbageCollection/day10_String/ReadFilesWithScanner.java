package day18_garbageCollection.day10_String;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException { // to advoid the scanner

        Scanner scan = new Scanner(Path.of("src/day10_String/Test.txt")); //file has to stay open otherwise it will show error
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine()); // to read the second line. In the future will learn more about loop to read the long story.

        System.out.println( scan.hasNextLine()); // to check if there is the next line in text file?  Result will turn true or false. will be useful with loop statement.

        scan.close();
    }
}
