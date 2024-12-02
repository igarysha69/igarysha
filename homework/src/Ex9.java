import java.util.Scanner;
public class Ex9 {

    public static void main(String[] args) {

        Scanner on = new Scanner(System.in);


            System.out.print("Введите температуру: ");
            int digit = on.nextInt();

            if (digit > -5) {

                System.out.print("Warm");

            } else if (digit <= -5 && digit > -20) {
                System.out.print("Normal");

            }
             else if (digit <= -20) {
                System.out.print("Cold");
            }




    }
}