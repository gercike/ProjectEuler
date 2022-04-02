import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestProductInAGrid {
    static File file = new File("C:\\Users\\Gercike\\IdeaProjects\\ProjectEuler\\files\\LargestProductInAGrid\\grid.txt");
    static int[][] array = new int[20][20];

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(getLargestProductInGrid(array, 4));
    }

    static int getLargestProductInGrid(int[][] grid, int numberOfElements) {
        int product = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j < grid[i].length - numberOfElements) {
                    int productHorizontal = 1;
                    for (int k = 0; k < numberOfElements; k++) {
                        productHorizontal *= grid[i][j + k];
                    }
                    if (productHorizontal > product) {
                        product = productHorizontal;
                    }
                }
                if (i < grid.length - numberOfElements) {
                    int productVertical = 1;
                    for (int k = 0; k < numberOfElements; k++) {
                        productVertical *= grid[i + k][j];
                    }
                    if (productVertical > product) {
                        product = productVertical;
                    }
                }
                if (j < grid[i].length - numberOfElements && i < grid.length - numberOfElements) {
                    int productFromLeftToRightDownward = 1;
                    for (int k = 0; k < numberOfElements; k++) {
                        productFromLeftToRightDownward *= grid[i + k][j + k];
                    }
                    if (productFromLeftToRightDownward > product) {
                        product = productFromLeftToRightDownward;
                    }
                }
                if (i > numberOfElements && j < grid[i].length - numberOfElements) {
                    int productFromLeftToRightUpward = 1;
                    for (int k = 0; k < numberOfElements; k++) {
                        productFromLeftToRightUpward *= grid[i - k][j + k];
                    }
                    if (productFromLeftToRightUpward > product) {
                        product = productFromLeftToRightUpward;
                    }
                }
            }
        }
        return product;
    }
}
