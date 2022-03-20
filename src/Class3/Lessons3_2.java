package Class3;

public class Lessons3_2 {
    public static void main (String[] args) { // закроет ли круг прямоугольник
        int a = 15; // сторона прямоугольника
        int b = 10; // сторона прямоугольника
        int r = 10; // радиус картонки
        double d = Math.sqrt (a * a + b * b); // определяем диагональ прямоугольника
        if ( d < 2*r) {
            System.out.println("Закроет");
        }
        else {
            System.out.println("Не закроет");
        }
}}
