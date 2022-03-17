package Class4;

public class Lessons4_4 {
    public static void main (String[] args) { // Найти среди чисел от 50 до 70 второе простое число
       boolean b = true;
       boolean s = false;
       for (int p=50; p<=70; p++) {
            for (int i=2; i<p; i++) {
                if (p%i==0){
                    b=false;
                    break;
                }
            }
       if (b) {
           if (s) {
               System.out.println(p);
               break;}
           s = true;
           }
        else b=true;
       }
    }
}