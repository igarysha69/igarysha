import java.util.Scanner;
public class Ex6 {

    public static void main(String[] args){
        Scanner on = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = on.nextInt();
        System.out.print("Введите второе число: ");
        int b = on.nextInt();

        a = a+b;
        b = a-b;
        a= a-b;

        System.out.println("Первое число: "+a);
        System.out.print("Второе число: "+ b);
    }
}






