// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

public class HW1 {
    public static void main(String[] args) {

        // 1. Метод. ArithmeticException: / by zero
        // System.out.println(divide(4, 0));

        // // 2. Метод. ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 10
        // System.out.println(getArrayElement(new int[10]));

        // // 3. Метод. NegativeArraySizeException: -1
        // System.out.println(getArrayLen(new int[-1]));
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int getArrayElement(int[] array) {
        return array[100];
    }

    public static int getArrayLen(int[] array) {
        return array.length;
    }
}

