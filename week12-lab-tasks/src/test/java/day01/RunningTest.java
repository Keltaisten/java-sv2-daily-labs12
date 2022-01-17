package day01;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    @Test
    void sumRunningDistance() {
        Running running = new Running();
        running.readFile("src/main/resources/running.csv");
        assertEquals(41.2,running.sumRunningDistance(2021, Month.DECEMBER));
        assertEquals(25.9,running.sumRunningDistance(2022, Month.JANUARY),0.0001);
    }
}