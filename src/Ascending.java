import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};
        int[] result = squareAccending(numbers);
        System.out.print("Squared order: " + Arrays.toString(result));
    }

    public static int[] squareAccending(int[] numbers) {
        int[] squaredNumbers = new int[numbers.length];

        for (int count = 0; count < numbers.length; count++) {
            squaredNumbers[count] = numbers[count] * numbers[count];
        }


        for (int count = 0; count < squaredNumbers.length - 1; count++) {
            for (int index = 0; index < squaredNumbers.length - 1 - count; index++) {
                if (squaredNumbers[index] > squaredNumbers[index + 1]) {

                    int temp = squaredNumbers[index];
                    squaredNumbers[index] = squaredNumbers[index + 1];
                    squaredNumbers[index + 1] = temp;
                }
            }
        }

        return squaredNumbers;
    }
}

