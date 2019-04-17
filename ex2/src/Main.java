public class Main {

    public static void main(String[] args) {
        // Створіть масив з усіх непарних чисел від 1 до 99,
        // виведіть його на екран у рядок,
        // а потім цей же масив виведіть на екран теж в рядок,
        // але в зворотному порядку (99 97 95 93 ... 7 5 3 1)
        int[] unpair = new int[50];
        for (int a = 1, b = 0; a < 100; a += 2) {
            unpair[b] = a;
            System.out.print(unpair[b] + " ");
            b++;
        }
        System.out.println();

        for (int b = 50; b > 0; b--) {
            System.out.print(unpair[b - 1] + " ");

        }


        System.out.println("\n");
        System.out.println("number 2");
    }
}
