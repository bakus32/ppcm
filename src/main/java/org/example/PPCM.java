package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PPCM {

    private final int firstNumber;
    private final int secondNumber;

    public PPCM(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int computePPCM() {
        if (this.firstNumber == 0 || this.secondNumber == 0)
            return -1;
        if (this.firstNumber == 1 && this.secondNumber == 1)
            return 1;
        final int[] resultDivionFirstNumber = new Division(this.firstNumber).computeDivion();
        final int[] resultDivionSecondNumber = new Division(this.secondNumber).computeDivion();

        return ppcm(resultDivionFirstNumber, resultDivionSecondNumber);
    }

    private int ppcm(int[] resultDivionFirstNumber, int[] resultDivionSecondNumber) {

        final int common = computeCommonElements(resultDivionFirstNumber, resultDivionSecondNumber);
        final int others = computeOthersElements(resultDivionFirstNumber, resultDivionSecondNumber);

        return common * others;
    }

    private int computeOthersElements(int[] resultDivionFirstNumber, int[] resultDivionSecondNumber) {

        int resultFirstElement = 1;
        int resultSecondElement = 1;

        for (int j : resultDivionFirstNumber) {
            if (!IntStream.of(resultDivionSecondNumber).boxed().toList().contains(j)) {
                resultFirstElement *= j;
            }
        }

        for (int j : resultDivionSecondNumber) {
            if (!IntStream.of(resultDivionFirstNumber).boxed().toList().contains(j)) {
                resultSecondElement *= j;
            }
        }
        return resultFirstElement * resultSecondElement;
    }

    private int computeCommonElements(int[] resultDivionFirstNumber, int[] resultDivionSecondNumber) {
        int result = 1;
        for (int number : commonElements(resultDivionFirstNumber, resultDivionSecondNumber)) {
            int occurenceFirstNumber = occurencesOfNumber(number, resultDivionFirstNumber);
            int occurencesSecondNumber = occurencesOfNumber(number, resultDivionSecondNumber);
            if (occurenceFirstNumber > occurencesSecondNumber) {
                result *= (int) Math.pow(number, occurenceFirstNumber);
            }
            if (occurenceFirstNumber < occurencesSecondNumber) {
                result *= (int) Math.pow(number, occurencesSecondNumber);
            }

            if (occurenceFirstNumber == occurencesSecondNumber) {
                result *= (int) Math.pow(number, occurencesSecondNumber);
            }
        }
        return result;
    }

    private int occurencesOfNumber(int number, int[] array) {
        int occurences = 0;
        for (int value : array) {
            if (value == number) {
                occurences++;
            }
        }
        return occurences;
    }

    private int[] commonElements(int[] resultDivionFirstNumber, int[] resultDivionSecondNumber) {
        return Arrays.stream(resultDivionFirstNumber).distinct().filter(x -> Arrays.stream(resultDivionSecondNumber).distinct().anyMatch(y -> y == x)).toArray();
    }
}