public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1"); // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установка невозможна");
        }

        System.out.println("Task 2"); // Задача 2

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 3"); // Задача 3

        int year = 2025;
        int leapYearIntroduced = 1584;
        if (year <= leapYearIntroduced) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println("Task 4"); // Задача 4

        int deliveryDistance = 95;
        int dayIn20Km = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней на доставку: " + dayIn20Km + " день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней на доставку: " + (dayIn20Km + 1) + " дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней на доставку: " + (dayIn20Km + 1 + 1) + " дня.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        System.out.println("Task 5 - 1"); // Задача 5 - 1 вариант проверка каждого варианта case
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует - номер месяца больше 12");
        }
        System.out.println("Task 5 - 2");// Задача 5 - 2 вариант проверка группы case
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует - номер месяца больше 12");
        }
    }
}