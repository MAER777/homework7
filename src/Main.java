public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
    }

    public static void test4() {
        System.out.println("Тестовые задачи");
        int salary = 65535;
        int total = 0;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
    }

    public static void test5() {
        System.out.println("Тестовые задачи");
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(total);
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
            System.out.println("Год " + year + ", численность населения составляет " + cityY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        int mountContribution = 0;
        int bet = 7;
        while (contribution < 12_000_000) {
            mountContribution++;
            contribution = contribution / 100 * bet + contribution;
            System.out.println("Месяц " + mountContribution + " сумма вклада: " + contribution);
        }
//        for (int mountC1 = 0; contribution < 12_000_000; mountC1++) {
//            contribution = contribution / 100 * bet + contribution;
//           System.out.println("Месяц " + mountC1 + " сумма вклада: " + contribution);
//        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        int bet = 7;
        for (int mountContribution = 0; contribution < 12_000_000; mountContribution++) {
            contribution = contribution / 100 * bet + contribution;
            if (mountContribution % 6 == 0) {
                System.out.println("Месяц " + mountContribution + " сумма вклада: " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int bet = 7;
        for (int mountContribution = 0; mountContribution < 9 * 12; mountContribution++) {
            contribution = contribution / 100 * bet + contribution;
            if (mountContribution % 6 == 0) {
                System.out.println("Месяц " + mountContribution + " сумма вклада: " + contribution);
            }
        }
        System.out.println("Общая сумма вклада за 9 лет: " + contribution);
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int friday = 7; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница: " + friday + " число.");
        }
//        int friday = 2;
//        int day = 0;
//        while (day < 31) {
//            day++;
//            if (day % 7 == friday) {
//                System.out.println("Сегодня пятница: " + day + " число.");
//            }
//        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int oldYears = 1823;
        int newYears = 2123;
        while (oldYears < newYears) {
            oldYears++;
            if (oldYears % 79 == 0) {
                System.out.println(oldYears);
            }
        }
    }
}