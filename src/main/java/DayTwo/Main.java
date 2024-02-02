package DayTwo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) {
        Path pathPuzzleInputDayTwo = Paths.get("src/main/java/DayTwo/puzzleInputDayTwo.txt");
        try {
            DayTwoSolver dayTwo = new DayTwoSolver();
            dayTwo.dayTwoPartOneSolver(pathPuzzleInputDayTwo);
            dayTwo.dayTwoPartTwoSolver(pathPuzzleInputDayTwo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}