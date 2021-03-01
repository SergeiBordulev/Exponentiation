public class Exponentiation {
    private static int raiseToPowerWithRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return number * raiseToPowerWithRecursion(number, power - 1);
    }

    private static int raiseToPowerWithoutRecursion(int number, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int power = 0;

        System.out.println(raiseToPowerWithoutRecursion(number, power));
        System.out.println(raiseToPowerWithRecursion(number, power));
    }
}
