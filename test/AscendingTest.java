import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendingTest {
    @Test
    public void testAscendingOrder() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, Ascending.squareAccending(arr));
    }
    @Test
    public void testThatArraySortedGetTheSquareOfTheArray() {
        int[] number = {5, 2, 8, 1, 4};
        int[] expected = {1, 4, 16, 25, 64};
        assertArrayEquals(expected, Ascending.squareAccending(number));
    }

    @Test
    public void testThatArraySortedGetTheSquareOfTheArrayWithNegativeNumbers() {
        int[] arr = {-5, -2, -8, -1, -4};
        int[] expected = {1, 4, 16, 25, 64};
        assertArrayEquals(expected, Ascending.squareAccending(arr));
    }

}