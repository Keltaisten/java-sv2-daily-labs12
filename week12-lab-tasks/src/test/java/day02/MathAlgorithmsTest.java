package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void biggestCommonDivider() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        System.out.println(mathAlgorithms.biggestCommonDivider(6,9));
        System.out.println(mathAlgorithms.biggestCommonDivider(6,12));
        System.out.println(mathAlgorithms.biggestCommonDivider(6,12));
        System.out.println(mathAlgorithms.biggestCommonDivider(9,15));
        System.out.println(mathAlgorithms.biggestCommonDivider(4,11));
    }
}