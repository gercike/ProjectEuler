import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestProductInASeries {
    static File file = new File("C:\\Users\\Gercike\\IdeaProjects\\ProjectEuler\\files\\LargestProductInASeries\\Largest product in a series.txt");

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(getTheLargestProductOfNMemberSeries(13));
    }

    static long getTheLargestProductOfNMemberSeries(int N) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String serie = scanner.next();
        long result = 0;
        for (int i = 0; i < serie.length() - N; i++) {
            long subResult = getTheProductOfDigits(serie.substring(i, i + N));
            if (subResult > result) {
                result = subResult;
            }
        }
        return result;
    }

    static long getTheProductOfDigits(String digits) {
        long result = 1;
        for (int i = 0; i < digits.length(); i++) {
            result *= Integer.parseInt(digits.substring(i, i + 1));
        }
        return result;
    }
}
