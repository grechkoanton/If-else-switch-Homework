public class Main {
    public static void main(String[] args) {
// Задача 1 - 1 вариант работа с двумя переменными
        int clientOSiOS = 0;
        int clientOSAndroid = 1;
        int clientDeviceYear = 2015;
        if (clientOSiOS > 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не получится скачать приложение, так как такой операционной системы нет.");
        }
        System.out.println();
        // Задача 1 - 2 вариант работа с одной переменной
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        // Задача 2 - 1 вариант работа с двумя переменными
        if (clientOSiOS > 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Не получится скачать приложение, так как такой операционной системы нет.");
            }
        } else if (clientOSAndroid > 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Не получится скачать приложение, так как такой операционной системы нет.");
            }
        }
        System.out.println();
        // Задача 2 - 2 вариант работа с одной переменной
        if (clientOS > 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS >= 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Не получится скачать приложение, так как такой операционной системы нет.");
        }

        System.out.println();

        // Задача 3
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
        // Задача 4
        int deliveryDistance = 95;
        int dayIn20Km = 1;
        if (0 < deliveryDistance && 20 > deliveryDistance) {
            System.out.println("Потребуется дней на доставку: " + dayIn20Km + " день.");
        } else if (20 < deliveryDistance && 60 > deliveryDistance) {
            System.out.println("Потребуется дней на доставку: " + (dayIn20Km + 1) + " дня.");
        } else if (60 < deliveryDistance && 100 > deliveryDistance) {
            System.out.println("Потребуется дней на доставку: " + (dayIn20Km + 1 + 1) + " дня.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        // Задача 5 - 1 вариант проверка каждого варианта case
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
        // Задача 5 - 2 вариант проверка группы case
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