public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        task1();
        task2();
        task3();
        task4();
    }

    public static void test1() {
        System.out.println("Тестовые задачи");
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
    }
    public static void test2() {
        System.out.println("Тестовые задачи");
        int start = 5;
        do {
            System.out.println(start);
            start = start - 1;
        }
        while (start > 0);
    }
    public static void test3() {
        System.out.println("Тестовые задачи");
        int salary = 65535;
        int total = 0;
        for (; total < 1_000_000; ) {
            total = total + total/100;
            total = total + salary;
            System.out.println(total);
        }
    }
    public static void test4() {
        System.out.println("Тестовые задачи");
        int salary = 65535;
        int total = 0;
        while (total < 1_000_000) {
            total = total + total/100;
            total = total + salary;
            System.out.println(total);
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int mount = 0;
        while (total < 2_459_000) {
            total = total + salary;
            mount++;
            System.out.println("Месяц " + mount + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int cityY = 12_000_000;
        int year = 0;
        int dead = 8;
        int life = 17;
        while (year < 10) {
            year++;
            cityY = cityY / 1000 * (life - dead) + cityY;
            System.out.println("Год " + year + ", численность населения составляет "  + cityY);
        }
    }

    public static void task4() {
    }
}