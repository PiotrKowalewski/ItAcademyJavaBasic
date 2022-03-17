package Class4;

public class Lessons4_5 {
    public static void main (String[] args) { //Вывести на экран текст для чисел которые делятся на 7 в диапазоне 1-100
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(+i+ " Hope!"); i++;
            }
        }

    }
}
