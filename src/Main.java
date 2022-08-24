public class Main {
    //task 1
    public static int searchNumbers(int year) {
        int yearsToLeapYear = year % 4;
        int yearOfCentury = year % 100;
        int yearOf4Century = year % 400;
        if (yearsToLeapYear == 0 && yearOfCentury != 0 || yearOf4Century == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — невисокосный год");
        }
        return yearsToLeapYear;
    }
    //task 2
    public static int sentMessage(int clientOS, int issueYears) {
        int issueYearsCouldInstallFull = 2022;
        if (clientOS == 1 && issueYears >= issueYearsCouldInstallFull) {
            System.out.print("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && issueYears >= issueYearsCouldInstallFull) {
            System.out.print("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && issueYears < issueYearsCouldInstallFull) {
            System.out.print("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && issueYears < issueYearsCouldInstallFull) {
            System.out.print("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.print("У нас есть приложения для iOS и Android!");
        }
        return issueYearsCouldInstallFull;
    }


    //task 3
    public static int countOfDays (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки карты: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки карты: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней для доставки карты: 3");
        } else {
            System.out.println(" Ваша карта будет готова к выдаче на следующий день после обращения. \n Выберите и посетите отделение банка в любой удобный для Вас день, в течении меяца ");
        }
        return deliveryDistance;
    }


    public static void main(String[] args)
    {
        System.out.println("задание 1\n");
        searchNumbers(2022);


        System.out.print("Задание 2\n");
        byte iOS = 0;
        byte Android = 1;
        byte clientOS = Android;
        short issueYears = 2012;

        sentMessage(clientOS, issueYears);


        System.out.print("Задание 3\n");
        int deliveryDistance = 95;
        countOfDays(deliveryDistance);

    }




}





