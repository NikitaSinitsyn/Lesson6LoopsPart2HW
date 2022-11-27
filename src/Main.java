public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int moneyForSave = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + moneyForSave;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        // Exercise 2
        int number = 0;
        while (number < 10) {
            number++;
            if (number <= 9) {
                System.out.print(number + " ");
            } else {
                System.out.println(number);
            }
        }
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Exercise 3
        int numberOfPeople = 12_000_000;
        int nuwBornPeople = 17;
        int deathPeople = 8;
        int difference = nuwBornPeople - deathPeople;
        for (int i = 1; i <= 10; i++) {
            numberOfPeople = numberOfPeople + (numberOfPeople * difference / 1000);
        }
        System.out.println(numberOfPeople);

        // Exercise 4
        int money = 15000;
        int moneyTotal = 0;
        int months = 0;
        while (moneyTotal < 12_000_000) {
            moneyTotal = moneyTotal + moneyTotal * 7 / 100;
            moneyTotal = money + moneyTotal;
            months++;
            if (months % 6 == 0) {
                System.out.println(moneyTotal);
            }
        }
        System.out.println("Необходимое колличество месяцов для накопления 12 000 000 равно " + months);

        // Exercise 5
        int amountOfMoney = 15000;
        int monthVasili = 9 * 12;
        int totalVasili = 0;
        for (int i = 0; i < monthVasili; i++) {
            totalVasili = totalVasili + totalVasili * 7 / 100;
            totalVasili = amountOfMoney + totalVasili;
            if (i % 6 == 0) {
                System.out.println(totalVasili);
            }
        }
        // Exercise 6
        int firstFriday = 5;
        int dayInMonth = 31;
        for (; firstFriday <= dayInMonth; firstFriday = firstFriday + 5) {
            System.out.println(" Today is Friday " + firstFriday + ". We need to prepare a report");
        }

        // Exercise 7
        int year200Before = 1822;
        int year100After = 2122;
        for (int i = 0; i <= year100After; i += 79) {
            if (i >= year200Before && i <= year100After) {
                System.out.println(i);
            }
        }
        // Exercise 8
        int firstNumber = 2;
        int secondNumber = 1;
        for (int i = 0; i < 10; i++) {
            int product = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + product);
            secondNumber++;
        }
    }
}
