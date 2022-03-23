package Class4;

public class Lessons4_2 {
    public static void main (String[] args) { // Вычеслить произведение чисел от 1 до 25
        double num = 1;
        double i = 1;
        do {
           num = num * i;
           i++;
        }
        while (i <= 25);
        System.out.println ("Произведение чисел от 1 до 25 -  " + num);
    }
}
