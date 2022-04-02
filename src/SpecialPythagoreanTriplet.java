public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println(getProductOfABC(1000));
    }

    static int getProductOfABC(int sumOfABC) {
        int A = 1;
        int C = 3;
        int B = C - A;
        while (A + B + C <= sumOfABC) {
            while (Math.pow(A, 2) + Math.pow(B, 2) <= Math.pow(C, 2) && A < B && B < C) {
                while (Math.pow(A, 2) + Math.pow(B, 2) <= Math.pow(C, 2) && A < B && B < C) {
                    if (isTrianglePythagorean(A, B, C) && A + B + C == sumOfABC) {
                        System.out.println("A: " + A);
                        System.out.println("B: " + B);
                        System.out.println("C: " + C);
                        return A * B * C;
                    }
                    B++;
                }
                A++;
                B = C - A;
            }
            C++;
            A = 1;
            B = C - A;
        }
        return -1;
    }

    static boolean isTrianglePythagorean(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
