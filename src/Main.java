public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise  one,two");

        int clientOS = 1,clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear<2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear<2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        System.out.println("Exercise  three");

        int year = 2021;
        if (year %100==0 && year %400 ==0 ) {
            System.out.println(year +"год является високосным».");
        }
        else if (year % 4 == 0 && year % 100 > 0)
                System.out.println(year +"год является високосным».");

            else if (year % 100 == 0)
                System.out.println(year +"год не является високосным");

            else
                System.out.println(year + "год не является високосным");



         System.out.println("Exercise four");

  {
        int deliveryDistance =95;
        if(deliveryDistance<= 20)
        {System.out.println("Потребуется дней: 1");
        }
        if(deliveryDistance>20 && deliveryDistance<60 )
        {System.out.println("Потребуется дней: 2");
        }
        if(deliveryDistance>60 && deliveryDistance<100 )
        {System.out.println("Потребуется дней: 3 ");
        }

      System.out.println("Exercise five");

        int monthNumber = 12;
        switch (monthNumber){
        case 1,2,12:
        System.out.println("Зима");
        break;
        case 3,4,5:
        System.out.println("Весна");
        break;
        case 6,7,8:
        System.out.println("Лето");
        break;
        case 9,10,11:
        System.out.println("Осень");
        break;

            }





}}}