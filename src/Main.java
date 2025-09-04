//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int capital = 0;
        for (int i = 1; i < 13; i++) {
            capital = capital + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
        }
        System.out.println("Задача 9");
        int moneyInBank = 0;
        int monthlyIncome = 29000;
        for (int i = 1; i < 13; i++) {
            moneyInBank = (moneyInBank / 100) + monthlyIncome + moneyInBank;
            System.out.println("Месяц " + i + " сумма накоплений равна " + moneyInBank + " рублей");
        }
        System.out.println("Задача 10");
        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }

    }
}
