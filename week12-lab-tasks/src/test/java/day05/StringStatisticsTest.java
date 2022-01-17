package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void charactersInAWord() {
        StringStatistics ss = new StringStatistics();
        System.out.println(ss.charactersInAWord("Ez egy szép mondat."));
        System.out.println(ss.charactersInAWord("Egy kicsit hosszabb mondat, mert a másikból nem készült " +
                "valami hosszú hashMap."));

        Map<Character, Integer> result = ss.charactersInAWord("almafa");
        assertEquals(3,result.get('a'));
        assertEquals(1,result.get('m'));
    }
}