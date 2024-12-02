import java.util.Scanner;
public class Ex8 {

    public static void main(String[] args) {

        Scanner on = new Scanner(System.in);

        while (true) {

            System.out.print("Введите число: ");
            int digit = on.nextInt();

            int number = digit % 10;

            if (number == 0 || number == 2 || number == 4 || number == 6 || number == 8) {

                System.out.print("Четное");

            } else {
                System.out.print("Нечетное");

            }


        }

    }
}