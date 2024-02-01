package DayOne;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class newDayOnePartOneSolver {

    public List<String> newGetFileOnlyWithNumbers(String puzzleInputPath) {
        List<String> result = new ArrayList<>();
        try {
            List<String> inputLines = Files.readAllLines(Path.of(puzzleInputPath));

            for (String line : inputLines) {
                String lineWithoutLetters = line.replaceAll("[a-zA-Z]", "");
                result.add(lineWithoutLetters);
            }
            System.out.println("new file with first and last number from lines is written. ");
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return result;
    }
}
