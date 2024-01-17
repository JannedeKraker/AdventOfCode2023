package DayOne;

import java.io.*;
import java.util.Scanner;

public class DayOnePartTwoSolver {

    public File replaceWordsToNumbersInNewFile(File puzzleInput, String newFilePath) {
        String wordOne = "one", wordTwo = "two", wordThree = "three",
                wordFour = "four", wordFive = "five", wordSix = "six",
                wordSeven = "seven", wordEight = "eight", wordNine = "nine";
        String numberOne = "1", numberTwo = "2", numberThree = "3",
                numberFour = "4", numberFive = "5", numberSix = "6",
                numberSeven = "7", numberEight = "8", numberNine = "9";


        try {
            File wordsToNumbers = new File(newFilePath);
            Scanner myFileReader = new Scanner(puzzleInput);
            PrintWriter out = new PrintWriter(wordsToNumbers);

            while (myFileReader.hasNextLine()) {

                String allTheLines = myFileReader.nextLine();
                String replacedWordsIntoNumbers = allTheLines
                        .replace(wordNine, numberNine)
                        .replace(wordEight, numberEight)
                        .replace(wordOne, numberOne)
                        .replace(wordTwo, numberTwo)
                        .replace(wordThree, numberThree)
                        .replace(wordFour, numberFour)
                        .replace(wordFive, numberFive)
                        .replace(wordSix, numberSix)
                        .replace(wordSeven, numberSeven);


                out.println(replacedWordsIntoNumbers);

            }
            out.close();
            System.out.println("new file with numbers instead of word numbers is written.");
            return wordsToNumbers;
        } catch (
                FileNotFoundException e) {
            System.out.println("file not found");
            return puzzleInput;
        }

    }
}

