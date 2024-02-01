package DayTwo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) {
        Path pathPuzzleInputDayTwo = Paths.get("src/main/java/DayTwo/puzzleInputDayTwo.txt");
        try {
            new DayTwoSolver(pathPuzzleInputDayTwo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        String testLine = "Game 1: 13 green, 3 red; 4 red, 9 green, 4 blue; 9 green, 10 red, 2 blue";
//        DayTwoSolver dayTwoSolver = new DayTwoSolver();
//        String gameName = dayTwoSolver.getGameName(testLine);
//        String lineWithoutGameName = dayTwoSolver.getGameLineWithoutGameName(testLine);
//        System.out.println(gameName);
//        System.out.println(lineWithoutGameName);
//        int game = dayTwoSolver.getNumberFromString(gameName);
//        System.out.println(game);
//        String[] gameHands = dayTwoSolver.getHands(lineWithoutGameName);
//        System.out.println(gameHands[0] + "\n" + gameHands[1] + "\n" + gameHands[2] + "\n" + gameHands[3] + "\n" + gameHands[4] + "\n" + gameHands[5] + "\n" + gameHands[6] + "\n" + gameHands[7]);
//        int highestGreen = dayTwoSolver.getHighestNumberFromColor(gameHands,"green");
//        int highestRed = dayTwoSolver.getHighestNumberFromColor(gameHands,"red");
//        int highestBlue = dayTwoSolver.getHighestNumberFromColor(gameHands,"blue");
//        System.out.println("highest green = " + highestGreen + "\n" +
//                "highest red = " + highestRed + "\n" +
//                "highest blue = " + highestBlue);
//        boolean possibleGame = dayTwoSolver.IsGamePossible(highestRed,highestGreen,highestBlue);
//        System.out.println("is game possible? " + possibleGame);
    }
}