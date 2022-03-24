public class MutliplesOf3And5 {
    public static void main(String[] args) {
        System.out.println(findTheMultiplesOf3And5(1000));
    }

    static int findTheMultiplesOf3And5(int number) {
        int result = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
