package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void readFile() {
    }

    @Test
    void howManyLesson() {
        SubjectService lecture = new SubjectService();
        lecture.readFile(Paths.get("src/test/resources/beosztas.txt"));
        assertEquals(3,lecture.howManyLesson("Albatrosz Aladin"));
    }
}