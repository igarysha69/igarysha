import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);

        System.out.print("Введите число: ");
        float number = on.nextFloat();
        float digit = (number * 10) % 10;

        if (digit>=5) {

        float okrug = number + 1;
        System.out.print("Результат округления: "+okrug);

        } else {
            System.out.print("Результат округления: "+number);

        }

    }






}
