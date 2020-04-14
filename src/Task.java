import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        int X = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите Y: ");
        int Y = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите Z: ");
        int Z = in2.nextInt();
        int C = (X+Y+Z)/3;
        System.out.println("Среднее арифметическое: "+ C);
        int A = C/2;
        int D = C%2;
//        if(D == 0){
//            System.out.println("Среднее арифметическое делится без остатка, результат: " + A);
//        }else{
//            System.out.println("Среднее арифметическое не делится без остатка.");
//        }
        if(D == 0){
            System.out.println("Результат деления без остатка: " + A);
        }else{
            int B = C-D;
            int E = B/2;
            System.out.println("Результат деления без остатка: " + E);
        }
        if(C>3){
            System.out.println("Программа выполнена корректно.");
        }else{
            System.out.println("Программа выполнена не корректно.");
        }


    }
}
