import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargeSum {
    static File file = new File("C:\\Users\\Gercike\\IdeaProjects\\ProjectEuler\\files\\LargeSum\\largesum.txt");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNext()) {
            arrayList.add(scanner.next());
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList("2255", "5389", "6293", "2834"));
        System.out.println(getSumOfStringNumbers(arrayList));
    }

    static String getSumOfStringNumbers(List<String> numbers) {
        String largeSum = "";
        int remainder = 0;
        for (int i = numbers.get(0).length() - 1; i >= 0; i--) {
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number.substring(i, i + 1));
            }
            sum += remainder;
            String sumString = String.valueOf(sum);
            largeSum = sumString.substring(sumString.length() - 1).concat(largeSum);
            remainder = Integer.parseInt(sumString.substring(0, sumString.length() - 1));
        }
        largeSum = String.valueOf(remainder).concat(largeSum);
        return largeSum;
    }
}
