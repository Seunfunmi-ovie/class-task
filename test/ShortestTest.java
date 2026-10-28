import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestTest {
    @Test
    public void testThatICanGetTheShortestWordInAString() {
        String sentence = "Seunfunmi is a software engineer";
        String expected = "a";
        String actual = Shortest.findShortestString(sentence);
        assertEquals(expected, actual);
    }

    @Test
    public void testThatFunctionCanGetDuplicateShortestWords() {
        String sentence = "I am a software engineer";
        String expected = "I";
        String actual = Shortest.findShortestString(sentence);
        assertEquals(expected, actual);
    }

    @Test
    public void testThatFunctionCanGetShortestWordInTheSentence() {
        String sentence = "I am a software engineer";
        String expected = "I";
        String actual = Shortest.findShortestString(sentence);
        assertEquals(expected, actual);

    }
}