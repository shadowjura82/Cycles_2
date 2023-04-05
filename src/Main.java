public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int investitionValue = 15000;
        int summCount = 0;
        int monthCount = 0;
        while (summCount < 2_459_000) {
            summCount += investitionValue;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + summCount + " рублей");
            monthCount++;
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        byte x = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        int countPeople = 12_000_000;
        byte birthPeople = 17;
        byte deadPeople = 8;
        for (int i = 1; i <= 10; i++) {
            countPeople = countPeople + (countPeople / 1000 + 17) - (countPeople / 1000 - 8);
            System.out.println("Год " + i + ", численность населения составляет " + countPeople);
        }
    }
}