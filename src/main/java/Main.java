public class Main {
    public static void main(String[] args) {
        //В Японии числа 4 и 9 считаются несчастливыми.
        //Вам нужно пронумеровать 100 космических шаттлов для перевозки людей на Марс так,
        //чтобы в номерах шаттлов не случалось несчастливых чисел. Напишите функцию, выводящую все номера таких шаттлов.

        int counterShuttles = 0;
        for (int i = 0; ; i++) {
            if (i / 10 == 4 || i / 10 == 9 ||
                    i / 10 == 14 || i / 10 == 19 || i % 10 == 4 || i % 10 == 9) {
                continue;
            } else {
                counterShuttles++;
            }
            if (counterShuttles == 100){
                break;
            }
            System.out.println(i);
        }

    }

}
