package DayOne;

import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class DayOnePartOneSolver {

    public File getFileOnlyWithNumbers(File puzzleInput, String filePath) {

        try {
            File puzzleOnlyNumbers = new File(filePath);
            Scanner myFileReader = new Scanner(puzzleInput);
            PrintWriter out = new PrintWriter(puzzleOnlyNumbers);

            String regexNoLetters = "[a-zA-Z]";
            String replaceWithNothing = "";


            while (myFileReader.hasNextLine()) {
                String allTheLines = myFileReader.nextLine();
                String lineWithoutLetters = allTheLines.replaceAll(regexNoLetters, replaceWithNothing);

                out.println(lineWithoutLetters);


            }

            out.close();
            System.out.println("new file with first and last number from lines is written. ");
            return puzzleOnlyNumbers;

        } catch (
                FileNotFoundException e) {
            System.out.println("File not found");
            return puzzleInput;

        }
    }

    public File getFileWithOnlyFirstAndLastNumber(File input, String fileOutput) {
        try {
            File puzzleOnlyFirstAndLastNumber = new File(fileOutput);
            PrintWriter out = new PrintWriter(puzzleOnlyFirstAndLastNumber);
            Scanner myFileReader = new Scanner(input);
            int placeFirstNumber = 0;
            int placeLastNumber = 1;

            while (myFileReader.hasNextLine()) {
                String allTheLines = myFileReader.nextLine();
                char firstNumber = allTheLines.charAt(placeFirstNumber);
                char lastNumber = allTheLines.charAt(allTheLines.length() - placeLastNumber);
                out.println(firstNumber + "" + lastNumber);
            }
            out.close();
            return puzzleOnlyFirstAndLastNumber;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return input;
        }
    }

    public int getSumAllNumbers(File input) {
        try {
            Scanner myFileReader = new Scanner(input);
            int sumAllNumbers = 0;
            while (myFileReader.hasNextLine()){
                String allTheNumbersAsString = myFileReader.nextLine();
                int allTheNumbersAsInt = Integer.parseInt(allTheNumbersAsString);
                sumAllNumbers += allTheNumbersAsInt;
            }
            return sumAllNumbers;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return 0;
        }
    }
}
