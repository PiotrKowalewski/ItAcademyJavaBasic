package Class3;

public class Lessons3_6 {
    public static void main (String[] args) { //задать метод и отобразить то, что запланировано
        int d = 2;
            switch (d) {
                case 1:
                    System.out.println ("Понедельник -" + " отдыхаем после выходных");
                    break;
                case 2:
                    System.out.println ("Вторник -" + " готовимся к работе");
                    break;
                case 3:
                    System.out.println ("Среда -" + " усердно работаем");
                    break;
                case 4:
                    System.out.println ("Четверг -" + " отдыхаем от работы");
                    break;
                case 5:
                    System.out.println ("Пятница -" + " готовимся к выходным");
                    break;
                case 6:
                    System.out.println ("Суббота -" + " отдыхаем");
                    break;
                case 7:
                    System.out.println ("Воскресенье -" + " отдыхаем");
                    break;
                default:
                    System.out.println ("Такого дня не существует");
            }
    }
}
