public class SmallestMultiple {
    public static void main(String[] args) {
        System.out.println(findSmallestMultiple(20));
    }

    static int findSmallestMultiple(int number) {
        int result = number;
        for (int multiplier = 1; result > 0; multiplier++) {
            result = number * multiplier;
            if (isItCommonMultiple(result, number)) {
                return result;
            }
        }
        return -1;
    }

    static boolean isItCommonMultiple(int theMultiple, int biggestDivider) {
        while (biggestDivider >= 1 && theMultiple % biggestDivider == 0) {
            if (biggestDivider == 1) {
                return true;
            }
            biggestDivider--;
        }
        return false;
    }
}
