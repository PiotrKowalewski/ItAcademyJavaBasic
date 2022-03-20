package Class3;

public class Lessons3_3 {
    public static void main (String[] args) { // вывести на экран число, добавив к нему слово "рублей" в правильном падеже
        int money;
        money = 11;
        if (money == 1 || money % 10 == 1 && money != 11) {
             System.out.println(+ money + " рубль");
        }
        else if (money == 2 || money % 10 == 2 && money != 12) {
             System.out.println(+ money + " рубля");
            }
        else {
            System.out.println(+ money + " рублей");
        }
    }
}
