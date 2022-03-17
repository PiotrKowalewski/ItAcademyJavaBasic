package Class4;

public class Lessons4_1 {
    public static void main (String[] args) { // Вычеслить факториал целых чисел от 0 до 10
        int fac = 1;
        int i = 0;
        while (i<=10) {
            i++;
            fac *= i;
            System.out.println (+ i + " факториал -  " + fac);
        }
    }
}
