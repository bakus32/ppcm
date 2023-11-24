package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Division {
    private int number;
    public Division(int number) {
        this.number = number;
    }
    public int[] computeDivion() {

        List<Integer> result = new ArrayList<>();

        if (this.number == 0)
            throw new IllegalArgumentException();

        computeSimpleNumbers(this.number, result);

        while(isNotSimpleNumber(this.number)){
            computeModulo(this.number, result);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void computeModulo(int number, List<Integer> result) {

        for(int value : Arrays.asList(2,3,5,7,11,13)){
            if(isModulo(number, value)){
                logicWhenModulo(value, result);
                break;
            }
        }
    }

    public boolean isModulo(int number, int value){
        return number % value == 0;
    }

    private void logicWhenModulo(int value, List<Integer> result) {
        setNumber(value);
        result.add(value);
        computeSimpleNumbers(this.number, result);
    }

    private void computeSimpleNumbers(int number , List<Integer> result) {
        if (isSimpleNumber(number)) {
            result.add(number);
        }
    }

    private boolean isSimpleNumber(int number) {
        return Arrays.asList(1, 2, 3, 5,7,11,13).contains(number);
    }

    private boolean isNotSimpleNumber(int number) {
        return !isSimpleNumber(number);
    }

    private void setNumber(int value) {
        this.number = this.number/value;
    }



}
