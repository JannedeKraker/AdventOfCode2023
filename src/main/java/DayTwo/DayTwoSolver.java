package DayTwo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DayTwoSolver {

    DayTwoSolver(Path filePath) throws IOException {
        List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        int sumPossibleGameLines = 0;
        for (String line : lines) {
            String gameLineWithoutGameName = getGameLineWithoutGameName(line);
            String[] hands = getHands(gameLineWithoutGameName);
            int highestRed = getHighestNumberFromColor(hands, "red");
            int highestGreen = getHighestNumberFromColor(hands, "green");
            int highestBlue = getHighestNumberFromColor(hands, "blue");
           if (IsGamePossible(highestRed,highestGreen,highestBlue)) {
               int gameNumber = getNumberFromString(getGameName(line));
               sumPossibleGameLines += gameNumber;
           }

    }
        System.out.println(sumPossibleGameLines);
}

public String getGameName(String gameLine) {
    String[] gameLineArray = gameLine.split(":");
    String gameName = gameLineArray[0];
    return gameName;
}

public String getGameLineWithoutGameName(String gameLine) {
    String[] gameLineArray = gameLine.split(":");
    String GameLineWithoutGameName = gameLineArray[1];
    return GameLineWithoutGameName;
}

public String[] getHands(String gameLineWithoutGameName) {
    String[] HandsArray = gameLineWithoutGameName.split("(;)|(,)");
    return HandsArray;
}

public int getNumberFromString(String gameName) {
    String numbersOnly = gameName.replaceAll("[^0-9]", "");
    int numberFromGameName = Integer.parseInt(numbersOnly);
    return numberFromGameName;
}

public int getHighestNumberFromColor(String[] HandsArray, String color) {
    int highestNumberFromColor = 0;

    for (String hand : HandsArray) {
        if (hand.contains(color)) {
            if (highestNumberFromColor <= getNumberFromString(hand)) {
                highestNumberFromColor = getNumberFromString(hand);
            }
        }
    }
    return highestNumberFromColor;
}

public boolean IsGamePossible(int highestRed, int highestGreen, int highestBlue) {
    if (highestRed > 12) {
        return false;
    } else if (highestGreen > 13) {
        return false;
    } else return highestBlue <= 14;
}
}


