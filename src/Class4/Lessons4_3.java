package Class4;

public class Lessons4_3 {
    public static void main (String[] args) { // Посчитать сумму цифр числа 7893823445
        long i = 7893823445l;
        long num = (i);
        long sum = 0;
        do {
            sum = sum + num % 10;
            num = num / 10;
        }
        while (num != 0);{
              System.out.println("Сумма цифр числа " + i + " =  " + sum);
        }
    }
}
