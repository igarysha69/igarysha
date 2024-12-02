import java.util.Scanner;
public class Ex1{
    public static void main(String[] args){
        Scanner on = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float numberone = on.nextFloat();

        System.out.print("Введите второе число: ");
        float numbertwo = on.nextFloat();

        System.out.println(4*(numberone+numbertwo-1)/2);
    }


}
