package org.example;
import java.io.FileNotFoundException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            WordProcessor file1 = new WordProcessor("file1.txt");
            WordProcessor file2 = new WordProcessor("file2.txt");
                file1.readFile();
                file2.readFile();
            Set<String> file1Set = file1.getDistinctWords();
            Set<String> file2Set = file2.getDistinctWords();

            System.out.println(SimilarityCalculator.calculateSimilarity(file1Set, file2Set));
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
