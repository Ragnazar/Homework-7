import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //task 1
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task2
        int payMin = arr[0];
        int payMax = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (payMin > arr[i]) {
                payMin = arr[i];
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (payMax < arr[i]) {
                payMax = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + payMin + " рублей. Максимальная сумма трат за день составила " + payMax + " рублей");
        //task3
        double payAverage = Math.ceil((double) sum / arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + payAverage + " рублей");

        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //task5
        int number = 1;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = number;
                }
                if (j == matrix.length - 1 - i) {
                    matrix[i][j] = number;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //task 6
        int[] oldArr = {5, 4, 3, 2, 1};
        int[] newArr = new int[oldArr.length];
        System.out.println(Arrays.toString(oldArr));
        for (int i = 0; i < oldArr.length; i++) {
            newArr[oldArr.length - 1 - i] = oldArr[i];
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println();

        //task 7
        int temp;
        for (int i = 0, j = oldArr.length - 1; i < j; i++, j--) {
            temp = oldArr[i];
            oldArr[i] = oldArr[j];
            oldArr[j] = temp;
        }
        System.out.println(Arrays.toString(oldArr));
        System.out.println();

        //task 9
        number = -2;
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(array);
        for (int k : array) {
            for (int j = (array.length - 1) / 2; j >= 0; j--) {
                if (k + array[j] == number) {
                    System.out.println("Найденные числа: " + k + " " + array[j]);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
