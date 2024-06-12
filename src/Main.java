public class Main {
    public static void main(String[] args) {
        System.out.println("Task  1");
        int year = 1800;
        checkYear(year);
        printSeparator();

        System.out.println("Task  2");
        int currentYear = 2020;
        int  clientOS = 1;
        checkClientPlugin(currentYear,clientOS);
        printSeparator();

        System.out.println("Task  3");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        checkDeliveryDays(deliveryDistance,deliveryDays);
        printSeparator();
    }

    public static void checkYear(int currentYear)  {
        boolean yearIsValid = (currentYear > 1584);
        boolean yearIsLeap = (currentYear % 4 == 0 && currentYear % 100!= 0 || currentYear % 400 == 0);
        if (yearIsValid && yearIsLeap) {
            System.out.println(currentYear + " год является високосным");
        } else if (yearIsValid &&!yearIsLeap) {
            System.out.println(currentYear + " год не является високосным");
        } else if (!yearIsValid) {
            System.out.println("Все года до 1584 не являются високосными");
        }
    }

    public static void checkClientPlugin(int currentYear, int clientOS) {
        int yearOldDevice = 2015;
        boolean clientDevice = (currentYear < yearOldDevice);
        if (!clientDevice && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (!clientDevice && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDevice && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDevice && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void checkDeliveryDays(int deliveryDistance, int deliveryDays)  {
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void printSeparator()  {
        System.out.println("-----------------------------------------");
    }
}