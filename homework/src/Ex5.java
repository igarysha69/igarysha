import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args){
        Scanner on = new Scanner(System.in);

        System.out.print("введите первое число: ");
        int digitone =  on.nextInt();
        System.out.print("введите второе число: ");
        int digittwo = on.nextInt();



    int result = digitone / digittwo;
    int ostatok = digitone - (result * digittwo);
    System.out.println("Целое: " + result);
    System.out.print("Остаток: " + ostatok);

            }
    }




