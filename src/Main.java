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
