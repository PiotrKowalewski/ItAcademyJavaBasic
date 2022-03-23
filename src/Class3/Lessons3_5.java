package Class3;

public class Lessons3_5 {
    public static void main(String[] args) { // Поместятся ли два дома на участке
        int a = 10; // Сторона дома 1
        int b = 15; // Сторона дома 1
        int c = 15; // Сторона дома 2
        int d = 16; // Сторона дома 2
        int e = 45; // Сторона участка
        int f = 30; // Сторона участка
        if (a+c<=e && a+d<=e && a+c<=f && a+d<=f && b+c<=e && b+d<=e && b+c<=f && b+d<=f)   {
            System.out.println("Поместятся");
        }
        else {
            System.out.println("Не поместятся");
        }
    }
}
