public class LargestPalindromeProduct {
    public static void main(String[] args) {
        System.out.println(getLargestPalindromeOfProductOfTwoNDigitIntegers(3));
    }

    static int getLargestPalindromeOfProductOfTwoNDigitIntegers(int N) {
        int largestProduct = (int) Math.pow(getLargestNDigitInteger(N), 2);
        for (int i = largestProduct; i > getSmallestNDigitInteger(N); i--) {
            if (isThisIntegerPalindrome(i) && isThisIntegerProductOf2NDigitInteger(i, N)){
                return i;
            }
        }
        return -1;
    }

    static boolean isThisIntegerProductOf2NDigitInteger(int numberToCheck, int N) {
        int largestPossibleDivider = getLargestNDigitInteger(N);
        int divider = largestPossibleDivider;
        while (numberToCheck / divider <= largestPossibleDivider) {
            if (numberToCheck % divider == 0) {
                return true;
            }
            divider--;
        }
        return false;
    }

    static int getLargestNDigitInteger(int N) {
        String startingProductString = "";
        for (int i = 0; i < N; i++) {
            startingProductString = startingProductString.concat("9");
        }
        return Integer.parseInt(startingProductString);
    }

    static int getSmallestNDigitInteger(int N) {
        String startingProductString = "1";
        for (int i = 1; i < N; i++) {
            startingProductString = startingProductString.concat("0");
        }
        return Integer.parseInt(startingProductString);
    }

    static boolean isThisIntegerPalindrome(int number) {
        String num = Integer.toString(number);
        if (num.length() > 1) {
            int first = 0;
            int last = num.length() - 1;
            while (first < last) {
                if (num.charAt(first) == num.charAt(last)) {
                    first++;
                    last--;
                } else return false;
            }
            return true;
        } else return false;
    }
}
