public class Main {
    public static void main(String[] args) {
        int counterShuttles = 0;
        for (int i = 0; ; i++) {
            if (i / 10 == 4 || i / 10 == 9 ||
                    i / 10 == 14 || i / 10 == 19 || i % 10 == 4 || i % 10 == 9) {
                continue;
            } else {
                System.out.println("Вы ввели не целочисленое значение, попробуйте снова");
                counterShuttles++;
            }
            if (counterShuttles == 100) {
                break;
            }
            System.out.println(i);
        }

    }
}
