package Class3;

public class Lessons3_4 {
    public static void main(String[] args) { // Вывести на экран дату следующего дня
        int d = 31;
        int m = 12;
        int y = 1984;
        if (m == 1 ^ m == 3 ^ m == 5 ^ m == 7 ^ m == 8 ^ m == 10) {
            if (d <= 30) {
                System.out.println("d=" + ++d);
                System.out.println("m=" + m);
                System.out.println("y=" + y);
            }
            else if (d == 31) {
                System.out.println("d=1");
                System.out.println("m=" + ++m);
                System.out.println("y=" + y);
            }
        }
        if (m == 2) {
            if (d <= 27) {
                System.out.println("d=" + ++d);
                System.out.println("m=" + m);
                System.out.println("y=" + y);
            }
            else if (d == 28) {
                if ((y % 4 == 0 & y % 100 != 0) | (y % 400 == 0)) {
                    System.out.println("d=" + ++d);
                    System.out.println("m=" + m);
                    System.out.println("y=" + y);
                    }
               else {
                    System.out.println("d=1");
                    System.out.println("m=" + ++m);
                    System.out.println("y=" + y);
                }}
            else if (d == 29) {
                if ((y % 4 == 0 & y % 100 != 0) | (y % 400 == 0)) {
                    System.out.println("d=1");
                    System.out.println("m=" + ++m);
                    System.out.println("y=" + y);
            }
             }
        }
        if (m == 4 ^ m == 6 ^ m == 9 ^ m == 11) {
            if (d <= 29) {
                System.out.println("d=" + ++d);
                System.out.println("m=" + m);
                System.out.println("y=" + y);
            }
            else if (d == 30) {
                System.out.println("d=1");
                System.out.println("m=" + ++m);
                System.out.println("y=" + y);
            }
        }
        if (m == 12) {
            if (d <= 30) {
                System.out.println("d=" + ++d);
                System.out.println("m=" + m);
                System.out.println("y=" + y);
            }
            else if (d == 31) {
                System.out.println("d=1");
                System.out.println("m=1");
                System.out.println("y=" + ++y + " С НОВЫМ ГОДОМ !!!");
            }
            }
        else if (m > 12) {
            System.out.println("В году 12 месяцев");
        }
    }
}