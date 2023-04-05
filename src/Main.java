public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        int investitionValue = 15000;
        int summCount = 0;
        int monthCount = 0;
        System.out.println("Задание 1");
        while (summCount < 2_459_000) {
            summCount += investitionValue;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + summCount + " рублей");
            monthCount++;
        }
        System.out.println();
    }

    public static void task2() {
        byte x = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}