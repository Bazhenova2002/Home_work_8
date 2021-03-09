//1) банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.
package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        int sumAmount = scanner.nextInt();
        System.out.println("Введите количество лет, сколько вклад находиться в банке");
        int year = scanner.nextInt();
        calculationAmount(sumAmount, year);

    }

    private static void calculationAmount(int sumAmount, int year) {
        int month = year * 12;
        double percentageOfAmount = sumAmount * 0.015;
        double percentageForYears = percentageOfAmount * month;
        double amount = sumAmount + percentageForYears;
        System.out.println("Сумма вклада с процентами на выходе: " + amount);
    }
}
