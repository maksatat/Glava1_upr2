/*
Адаптируйте программу из упражнения 1.2 так, чтобы она выводила таблицу преобразования дюймов в метры. Отображайте преобразования
длины до 12 футов через каждый дюйм. Через каждые 12 дюймов выводите пустую строку. (Один метр равен примерно 39,37 дюйма.)
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double foot, duym, metr; // объявляю переменные для футов, дюймов и метров
        int counter; // переменная счетчика
        counter = 0;
        foot = 0;
        //  сначала вывожу метры
        for (duym = 0; duym <= 200; duym++){
            metr = duym / 39.37;
            System.out.println( duym + " дюймов соответствует " + metr + " метрам");
        //  теперь футы, пока их не станет 12
            if (foot <=12) {
                foot = duym / 12;
            System.out.println("Футов "+ (foot));
            }
        //  счетчик строк, вывод пустой строки после каждых 12 дюймов
            counter++;

            if (counter ==12){
                System.out.println();
                counter = 0;
            }

        }
    }
}