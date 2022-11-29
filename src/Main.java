import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int accumulate = 2_459_000;
        int bank = 15_000;
        int mounth = 0;
        double percent = 0.01;
        int saving = 0;
        while (saving < accumulate) {
            saving += bank;
            saving += saving * percent;
            mounth++;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + saving + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();

        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int birth = 17;
        int death = 8;
        int people = 1000;
        int Y = 12_000_000;
        int peopleTotal = birth - death;
        for (int y = 1; y <= 10; y++) {
            Y += Y * peopleTotal / 1000;
            System.out.println("Год " + y + " численность населения составляет " + Y);
        }

    }

}