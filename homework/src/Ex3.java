import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);

        while (true){

            System.out.print("Введите трехзначное число: ");
            int number = on.nextInt();
            if (number>=100 && number<=999){
                int numberone = number / 100;
                int numbertwo = number % 100 / 10;
                int numberthree = number % 10;

                int summa=numberone+numbertwo+numberthree;

                System.out.println("Сумма этих чисел равна: "+summa);
                break;
            }
            else{
                System.out.println("Вы ввели некорректное число! Повторите попытку");
            }

        }
    }

}


