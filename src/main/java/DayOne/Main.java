package DayOne;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String commonPath = "C:\\Users\\ennaj\\Documents\\it project janne\\Portfolio\\AdventOfCode2023\\src\\main\\java\\DayOne\\";
        String onlyNumbersFilePath = commonPath + "onlyNumbers.txt";
        String puzzleInputFilePathPartOne = commonPath + "puzzleInputDayOne.txt";
        String onlyFirstAndLastNumberFilePath = commonPath + "onlyFirstAndLastNumber.txt";
        String wordsIntoNumbersFilePath = commonPath + "wordsIntoNumbers.txt";
        String onlyNumbersPartTwoFilePath = commonPath + "onlyNumbersPartTwo.txt";
        String onlyFirstAndLastNumberPartTwoFilePath = commonPath + "onlyFirstAndLastNumberPartTwo.txt";
        File puzzleInput = new File(puzzleInputFilePathPartOne);

        DayOnePartOneSolver solveDayOnePartOne = new DayOnePartOneSolver();
        DayOnePartTwoSolver solveDayOnePartTwo = new DayOnePartTwoSolver();

        File onlyNumbers = solveDayOnePartOne.getFileOnlyWithNumbers(puzzleInput, onlyNumbersFilePath);
        File onlyFirstAndLastNumber = solveDayOnePartOne.getFileWithOnlyFirstAndLastNumber(onlyNumbers, onlyFirstAndLastNumberFilePath);
        int sumAllNumbers = solveDayOnePartOne.getSumAllNumbers(onlyFirstAndLastNumber);
        System.out.println(sumAllNumbers);

        File puzzleInputPartTwoWordsIntoNumbers = solveDayOnePartTwo.replaceWordsToNumbersInNewFile(puzzleInput, wordsIntoNumbersFilePath);
        File onlyNumbersPartTwo = solveDayOnePartOne.getFileOnlyWithNumbers(puzzleInputPartTwoWordsIntoNumbers, onlyNumbersPartTwoFilePath);
        File onlyFirstAndLastNumberPartTwo = solveDayOnePartOne.getFileWithOnlyFirstAndLastNumber(onlyNumbersPartTwo,onlyFirstAndLastNumberPartTwoFilePath);
        int sumAllNumbersPartTwo = solveDayOnePartOne.getSumAllNumbers(onlyFirstAndLastNumberPartTwo);
        System.out.println(sumAllNumbersPartTwo);
    }
}