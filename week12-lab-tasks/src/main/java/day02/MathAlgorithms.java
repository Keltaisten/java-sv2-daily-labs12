package day02;

import java.util.HashMap;
import java.util.Map;

public class MathAlgorithms {
    public int biggestCommonDivider(int firstNumber, int secondNumber) {
        int divider = 1;
        Map<Integer, Integer> firstDividers;
        Map<Integer, Integer> secondDividers;
        Map<Integer, Integer> collectTheSameDividers = new HashMap<>();
        firstDividers = findAllTheDividers(firstNumber);
        secondDividers = findAllTheDividers(secondNumber);
        for (Integer actual : firstDividers.keySet()) {
            if (secondDividers.containsKey(actual)) {
                if(firstDividers.get(actual) >= secondDividers.get(actual)){
                    collectTheSameDividers.put(actual,secondDividers.get(actual));
                    divider *= actual * secondDividers.get(actual);
                }
                else {
                    collectTheSameDividers.put(actual,firstDividers.get(actual));
                    divider *= actual * firstDividers.get(actual);
                }
            }
        }
        return divider;
    }

    private Map<Integer, Integer> findAllTheDividers(int number) {
        int numberCopy = number;
        Map<Integer, Integer> dividers = new HashMap<>();
        boolean entrance;
        for (int i = 2; i < numberCopy; i++) {
            entrance = true;
            while (entrance) {
                if (number % i == 0) {
                    if (dividers.containsKey(i)) {
                        dividers.replace(i, dividers.get(i) + 1);
                        number /= i;
                    } else {
                        dividers.put(i, 1);
                        number /= i;
                    }
                } else {
                    entrance = false;
                }
            }
        }
        return dividers;
    }
}
