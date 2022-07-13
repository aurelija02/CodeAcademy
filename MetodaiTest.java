package Testai;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class MetodaiTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void smallestNumber() {
        Metodai metodai = new Metodai();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,9,5,6,7,3,4));
        Integer smallestNumb = metodai.smallestNumber(numbers);
        assertEquals(3, smallestNumb);
    }

    @Test
    void averageNumber() {
        Metodai metodai = new Metodai();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,4,2));
        Integer average = metodai.averageNumber(numbers);
        assertEquals(3, average);
    }

    @Test
    void middleCharacter() {
        Metodai metodai = new Metodai();
        String zodis = "katė";
        String vidurCharacteriai = metodai.middleCharacter(zodis);
        assertEquals ("at", vidurCharacteriai);

    }

    @Test
    void numbOfVowels() {
        Metodai metodai = new Metodai();
        String zodis = "kaciukas";
        Integer numbVowels = metodai.numbOfVowels(zodis);
        assertEquals(4, numbVowels);
    }
}