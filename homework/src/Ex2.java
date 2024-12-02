import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);

        while(true) {

            System.out.print("Введите двузначное число: ");
            int twonumbers = on.nextInt();

            if (twonumbers >= 10 && twonumbers <= 99) {

                int one = twonumbers / 10;
                int two = twonumbers % 10;

                int summa = one + two;

                System.out.print("Сумма этих чисел равна: " + summa);
                break;

            } else {
                System.out.println("Вы ввели некорректное число! Повторите попытку");
            }


        }
    }
}
