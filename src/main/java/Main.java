import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("Компьютер загадал число от 0 до 10, у тебя есть 3 попытки что бы его отгадать)");
        System.out.println();
        System.out.println("Поехали!!!");

        while (true) {
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                counter++;

                if (b == randomNumber) {
                    System.out.println("Поздравляю вы выиграли!!!");
                    break;
                } else if (counter == 3) {
                    System.out.println("Вы проиграли(");
                    break;
                } else {
                    System.out.println("Попробуйте еще раз");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Вы ввели не целочисленое значение, попробуйте снова");
                scanner.nextLine();
            }
        }


    }

}
