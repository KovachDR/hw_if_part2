public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС не определена");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int timeDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            timeDelivery = timeDelivery + 1;
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            timeDelivery = timeDelivery + 2;
            System.out.println("Потребуется дней: " + timeDelivery);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача №5");
        int montNumber = 12;
        switch (montNumber) {
            case 1:
                System.out.println("Январь. Сезон - зима");
                break;
            case 2:
                System.out.println("Февраль. Сезон - зима");
                break;
            case 3:
                System.out.println("Март. Сезон - весна");
                break;
            case 4:
                System.out.println("Апрель. Сезон - весна");
                break;
            case 5:
                System.out.println("Май. Сезон - весна");
                break;
            case 6:
                System.out.println("Июнь. Сезон - лето");
                break;
            case 7:
                System.out.println("Июль. Сезон - лето");
                break;
            case 8:
                System.out.println("Август. Сезон - лето");
                break;
            case 9:
                System.out.println("Сентябрь. Сезон - осень");
                break;
            case 10:
                System.out.println("Октябрь. Сезон - осень");
                break;
            case 11:
                System.out.println("Ноябрь. Сезон - осень");
                break;
            case 12:
                System.out.println("Декабрь. Сезон - зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}